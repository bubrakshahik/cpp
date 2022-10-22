<?php    
    if(isset($_POST['submit']))
    {
        $name = $_POST['name'];
        $email = $_POST['email'];
        $password = $_POST['password'];
        $password2 = $_POST['password2'];
        $file = $_POST['file']['tmp_name'];
        $file_name = $_POST['file']['name'];
        $file_type = strtolower(pathinfo(basename($file_name, PATHINFO_EXTENSION)));
                
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
        background-color:rgb(43, 49, 51);
        color:gold;
        font-family:Verdana, Geneva, Tahoma, sans-serif;
    }
    .form{
        display: flex;
        flex-direction: column;
        color:aliceblue;
        background-color: white;
        border: solid indigo;
        border-width: 20px 20px 20px 60px;
        border-radius: 20px;
        margin:0px 400px;
        padding: 0px 40px;
    }
    .form > input[type="text"], input[type="password"], input[type="email"]
    {
        padding: 5px 60px;
        margin: 5px 70px;
        
        text-indent: 10px;
        font-size: 20px;
        border: none;
        border: 1px solid indigo;
        border-radius:12px;
        background-color: rgba(75,0,130, .1);
        color: rgb(75,0,130);
    }
    .form > label, input[type="submit"], input[type="file"]{
        display: flex;
        margin: 10px 0px;
        color:indigo;
    }
    .form > input[type="submit"]{
        padding: 20px 0px;
        background-color:darkslategrey;
        color: white;
        border: none;
        border-radius: 12px;
    }
    .form > input[type="submit"]:hover{
        opacity: .5;
        cursor: pointer;
    }
    h1::after{
        content: "(Bubr@k $her)";
    }
    .sibling1{
        position: absolute;
        right: 454px;
        height: 482px;
        width: 20px;
        margin-top: -240px;
        border: solid white;
        border-width: 1px 1px 1px 0px;
        border-radius: 15px;

    }
    .sibling2{
        position: absolute;
        right: 452px;
        width: 20px;
        height: 482px;
        margin-top: -240px;
        border: solid white;
        border-width: 1px 1px 1px 0px;
        border-radius: 15px;


    }
    .sibling3{
        position: absolute;
        right: 450px;
        width: 20px;
        height: 482px;
        margin-top: -240px;
        border: solid white;
        border-width: 1px 1px 1px 0px;
        border-radius: 15px;

    }
    .sibling4{
        position: absolute;
        right: 448px;
        width: 20px;
        height: 482px;
        margin-top: -240px;
        border: solid white;
        border-width: 1px 1px 1px 0px;
        border-radius: 15px;

    }
    .parent{
        padding-top: 30px;
        position: relative;
        display: flex;
        flex-direction: row;
        gap: 0px;
        align-items: center;
        justify-content: center
    }
    .container{
        padding-top: 10px;
    }
    .form-alert{
        color: red;
    }

</style>
<body>
    
    <div class="container">
        <center>
            <h1>Login Form by </h1>
            <div class="parent">
        
            <form class = "form" action="" method = "POST" enctype = "multipart/form-data">
                
                <label for="name">Name</label>
                <input  required type="text" name ="name">
                <!-- <span class = "form-alert"><?php if(isset($typeError)){echo "* ".$typeError;}?></span> -->
                
                <label for="email">Email</label>
                <input  required type="email" name ="email">
                <!-- <span class = "form-alert"><?php if(isset($typeError)){echo "* ".$typeError;}?></span> -->
                
                <label for="password">Password</label>
                <input  required type="password" name ="password">
                <!-- <span class = "form-alert"><?php if(isset($typeError)){echo "* ".$typeError;}?></span> -->

                <label for="password2">Password</label>
                <input  required type="password" name ="password2">
                <!-- <span class = "form-alert"><?php if(isset($typeError)){echo "* ".$typeError;}?></span> -->

                <label for="file">Profile Picture</label>
                <input  required type="file" name ="file">
                <!-- <br><span class = "form-alert"><?php if(isset($typeError)){echo "* ".$typeError;}?></span> -->
                
                <br><br><input type="submit" name = "submit">
            </form>
            <div class="sibling-container">
            <div class="sibling1"></div>
            <div class="sibling2"></div>
            <div class="sibling3"></div>
            <div class="sibling4"></div>
            </div>

            </div>
        </center>
    </div>
</body>
</html>
