import java.util.Scanner;

//command line TicTacToe Game
public class TicTacToe {

    public static void printBox(char[][] ar){
        System.out.println("+------------------------------+");
        System.out.println("|         |           |        |");
        System.out.println("|   "+ar[0][0]+"     |     "+ar[0][1]+"     |   "+ar[0][2]+"    |");
        System.out.println("|         |           |        |");
        System.out.println("+------------------------------+");
        System.out.println("|         |           |        |");
        System.out.println("|   "+ar[1][0]+"     |    "+ar[1][1]+"      |   "+ar[1][2]+"    |");
        System.out.println("|         |           |        |");
        System.out.println("+------------------------------+");
        System.out.println("|         |           |        |");
        System.out.println("|   "+ar[2][0]+"     |    "+ar[2][1]+"      |   "+ar[2][2]+"    |");
        System.out.println("|         |           |        |");
        System.out.println("+------------------------------+");
    }

    public static boolean gameOver(char[][] ar){
        return ((ar[0][0] != ar[0][1] || ar[0][1] != ar[0][2]) || (ar[0][2] != 'X' && ar[0][2] != 'O')) &&
                ((ar[1][0] != ar[1][1] || ar[1][1] != ar[1][2]) || (ar[1][2] != 'X' && ar[1][2] != 'O')) &&
                ((ar[2][0] != ar[2][1] || ar[2][1] != ar[2][2]) || (ar[2][2] != 'X' && ar[2][2] != 'O')) &&
                ((ar[0][0] != ar[1][0] || ar[1][0] != ar[2][0]) || (ar[2][0] != 'X' && ar[2][0] != 'O')) &&
                ((ar[0][1] != ar[1][1] || ar[1][1] != ar[1][2]) || (ar[1][2] != 'X' && ar[1][2] != 'O')) &&
                ((ar[0][2] != ar[1][2] || ar[1][2] != ar[2][2]) || (ar[2][2] != 'X' && ar[2][2] != 'O')) &&
                ((ar[0][0] != ar[1][1] || ar[1][1] != ar[2][2]) || (ar[2][2] != 'X' && ar[2][2] != 'O')) &&
                ((ar[0][2] != ar[1][1] || ar[1][1] != ar[2][0]) || (ar[2][0] != 'X' && ar[2][0] != 'O'));
    }

    public static char playerDecider(int chance,char cp){
        char currentPlayer=cp;
        if (chance==0){
            Scanner sca=new Scanner(System.in);
            char input=' ';
            System.out.println("Enter 1 for O ");
            System.out.println("Enter 2 for X ");
            System.out.print("Enter your choice:: ");
            int choice=sca.nextInt();
            switch (choice) {
                case 1 -> input = 'O';
                case 2 -> input = 'X';
            }
            sca.close();
            currentPlayer=input;
            return currentPlayer;
        }
        else if(chance>0){
            System.out.println("current player is "+currentPlayer);
            if (currentPlayer=='X'){
                return 'O';
            } else if (currentPlayer=='O') {
                return 'X';
            }
        }
        return currentPlayer;
    }

    public static void main(String[] args) {
        char[][] ar=new char[3][3];
        int chance=0;
        char input;
        char cp='O';
        Scanner sc= new Scanner(System.in);
        boolean gameStatus=true;
        while (gameStatus){
            if (chance==0){
                cp='O';
            }
            input=playerDecider(chance,cp);
            cp=input;
            chance++;


            System.out.print("Enter position for "+input+" :: ");
            byte numPosition=sc.nextByte();
            byte row=0,column=0;
            switch (numPosition){
                case 1->{row=1;column=1;}
                case 2->{row=1;column=2;}
                case 3->{row=1;column=3;}
                case 4->{row=2;column=1;}
                case 5->{row=2;column=2;}
                case 6->{row=2;column=3;}
                case 7->{row=3;column=1;}
                case 8->{row=3;column=2;}
                case 9->{row=3;column=3;}
            }
            ar[row-1][column-1]=input;
            printBox(ar);
            gameStatus=gameOver(ar);
        }
        System.out.println("Game over");
        System.out.println("Congratulations!! You won..");
    }
}