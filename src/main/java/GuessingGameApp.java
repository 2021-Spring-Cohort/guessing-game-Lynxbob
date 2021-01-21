import java.sql.SQLOutput;
import java.util.*;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int randomNumber = 7;
        int guessedNumber = 0;

        System.out.print("Welcome to the Guessing Game! Please Guess a number between 1 and 10, or type 0 for instructions: ");
        do {
            guessedNumber = in.nextInt();

            if(guessedNumber == 0) {
                System.out.println("The goal of the game is to guess the random number between 1 and 10. Good Luck!");
            }
        } while (guessedNumber == 0);
        if(guessedNumber == randomNumber) {
            System.out.println("You win! " + randomNumber + " was the number!");
        }
        else {
            System.out.println("You lose! " + randomNumber + " was the number!");
        }

    }

}
