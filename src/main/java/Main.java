import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random ansGen = new Random();
        int correctGuess = ansGen.nextInt(100); //randomized correct answer
        System.out.println(correctGuess);
        int guessCounter = 1;
        int previousGuess = 0;
        String name;
        System.out.println("Welcome, what is your name?\n: ");
        name = in.nextLine();
        System.out.println("Welcome to the guessing game " + name + ". Guess a number between 1 to 100. You have 5 tries!\n Attempt #: " + guessCounter);
        int input = in.nextInt(); //what the user will input

        while (input != correctGuess) {

            if (input == previousGuess) {
                System.out.println("This number was used, try another one!");
                input = in.nextInt();

            } else if (input > correctGuess) {

                guessCounter++;
                System.out.println("Your guess is too high. Try again!");
                System.out.println("Attempt # " + guessCounter);
                previousGuess = input;
                input = in.nextInt();

            } else if (input < correctGuess) {


                guessCounter++;
                System.out.println("Your guess is too low. Try again!");
                System.out.println("Attempt # " + guessCounter);
                previousGuess = input;
                input = in.nextInt();

            }
            if (guessCounter >= 5 && input != correctGuess) {
                System.out.println("Game over, too many tries!");
                break;
            }

        }
        if (input == correctGuess) {
            System.out.println("Well done! " + name + ",you got it within " + guessCounter + " tries!");
        }
    }


}
