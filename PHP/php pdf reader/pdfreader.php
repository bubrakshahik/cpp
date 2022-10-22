<?php    
    if(isset($_POST['submit']))
    {
        $file_name = $_FILES['file']['name'];
        $targetdir = "./uploads/pdf/";
        $targetFile = $targetdir . basename($file_name);
        
        $file = $_FILES['file']['tmp_name'];

        $file_size = $_FILES['file']['size'];
        
        $file_type = strtolower(pathinfo($file_name, PATHINFO_EXTENSION));
    
        if($file_type == "pdf")
        {  
            //if you want to just read file use option a if you want to upload and then read use option b
            
            // a: direct read
            // $readFile = $file;
            
            //b: first upload a file
            
            if(!move_uploaded_file($file, $targetFile))
            {
                mkdir("./uploads/pdf", 0777, true);
                chmod("./uploads", 0777);
                chmod("./uploads/pdf", 0777);
                move_uploaded_file($file, $targetFile);
            }

            
            $readFile = $targetdir . basename($file_name);
            
            header("Content-type: application/pdf");
            header("Content-Description:inline;filename='.$readFile.'");
            header("Content-Transfer-Encoding:binary");
            header("Accept-Range: bytes");
            @readfile($readFile);

        }
        else
        {
            $typeError = "File must be in pdf.";
        }
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP READER</title>
</head>
<style>
    body{
        background-color: beige;
        color: blue;
        font-family:Verdana, Geneva, Tahoma, sans-serif;
    }
</style>
<body>
    
    <div class="container">
        <center>
            <h1>Please Select a PDF File to Read by (Bubrak Sher)</h1>
            <form action="index.php?id=pdf" method = "POST" enctype = "multipart/form-data">
                <input required type="file" name ="file">
                <br><span style = "color: red;"><?php if(isset($typeError)){echo "* ".$typeError;}?></span>
                <br><br><input type="submit" name = "submit">
            </form>
        </center>
    </div>
</body>
</html>
