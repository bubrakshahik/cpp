import java.util.Scanner;
import java.util.Random;

class Game {
    int noOfGuesses = 1;

    public int Game() {
        Random ab = new Random();
        return ab.nextInt(100);
    }

    public boolean initGame() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n\nDo you want to play the Game \n type y for yes and n for no :: ");
        String cons = sc.nextLine();
        char con = cons.charAt(0);
        if (con == 'y' || con == 'Y' || cons.equals("yes") || cons.equals("YES")) {
            return true;
        } else {
            return false;
        }
    }

    public int takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number between 0 to 100 :: ");
        return sc.nextInt();
    }

    public boolean isCorrectNumber(int userInput, int randValue) {
        return userInput == randValue;
    }

    public int res(boolean mm, int userInputValue, int systemGeneratedValue) {
        while (!mm) {
            if (userInputValue > systemGeneratedValue) {
                System.out.println("Entered number is greater number..");
            } else {
                System.out.println("Entered number is smaller number..");
            }
            userInputValue = takeUserInput();
            mm = isCorrectNumber(systemGeneratedValue, userInputValue);
            noOfGuesses++;
        }
        return noOfGuesses;
    }

    public void decider(boolean mm, int userInputValue, int systemGeneratedValue) {
        if (mm) {
            System.out.println("your number of guess was :: 1");
            System.out.println("\n You win \n \t The Game is over...");
        } else {
            int abbc = res(mm, userInputValue, systemGeneratedValue);
            System.out.println("your number of guess was :: " + abbc);
            System.out.println("You win \n The Game is over...");
        }
    }
}

public class guessTheNumber {
    public static void main(String[] args) {
        //Create a class Game, which allows a user to play "Guess the Number" game once.
        // Game should have the following methods:
        // Constructor to generate the random number
        // takeUserInput() to take a user input of number
        // isCorrectNumber() to detect whether the number entered by the user is true
        // getter and setter for noOfGuesses
        boolean abc = true;
       do {
            Game cc = new Game();
            int systemGeneratedValue = cc.Game();
            int userInputValue = cc.takeUserInput();
            boolean mm = cc.isCorrectNumber(systemGeneratedValue, userInputValue);
            cc.decider(mm, userInputValue, systemGeneratedValue);
            abc = cc.initGame();
        } while (abc);
    }
} 
