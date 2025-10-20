import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // TODO: Prompt the user with a welcome message
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1-100.");
        // TODO: Generate a random secret number between 1 and 100 (inclusive)
        Random rand = new Random();
        boolean connerChan = true;
        int num = rand.nextInt(100) + 1;
        // TODO: Use a do...while loop to read guesses until correct
        do {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            if (guess < num){
                System.out.println("Too low! Try again.");
            }
            else if (guess > num){
                System.out.println("Too high! Try again.");
            }
            else if (guess == num){
                System.out.println("You got it!");
                connerChan = false;
        }
        }while (connerChan);
    }
}

