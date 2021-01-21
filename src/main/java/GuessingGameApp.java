import java.util.*;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int randomNumber = 7;
        int guessedNumber = 0;

        System.out.print("Welcome to the Guessing Game! Please Guess a number between 1 and 10: ");
        guessedNumber = in.nextInt();
        if(guessedNumber == randomNumber) {
            System.out.println("You win! " + randomNumber + " was the number!");
        }
        else {
            System.out.println("You lose! " + randomNumber + " was the number !");
        }

    }

}
