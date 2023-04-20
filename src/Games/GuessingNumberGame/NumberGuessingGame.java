package src.Games.GuessingNumberGame;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 1000000000) + 1;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 1,000,000,000.");
        System.out.println("Try to guess the number in as few attempts as possible.");
        int counter = 0;

        do {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if (guess < numberToGuess) {
                counter++;
                System.out.println("Too Low!");
            } else if (guess > numberToGuess) {
                counter++;
                System.out.println("Too High!");
            }
        } while (guess != numberToGuess);

        // Player wins
        System.out.println("You won!");
        System.out.println("Your counter guesses is: " + counter + ".");
    }
}
