package src;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a char to reveal more the answer: ");

        ArrayList<Character> playerMove = new ArrayList<>();
        String word = "Elephant";
        int NumOfGuesses = 0;
        int NumOfGuessesLeft = 7;

        word = word.toLowerCase();


        while(true) {
        String guess = in.nextLine();
        playerMove.add(guess.charAt(0));



        System.out.print(resultOfPlayerMove(playerMove, word));
        System.out.println();

        if(winningPoint(playerMove, word)){
            System.out.println("You won the game!");
            break;
        }
        if(!checkIfStringHasChar(playerMove, word)) {
            NumOfGuessesLeft--;
        }
        System.out.println("You have " + NumOfGuessesLeft + " guesses left.");

            NumOfGuesses++;
        for(int index = 0;index<word.length();index++) {
            if (NumOfGuesses == 7) {
                if (!checkIfStringHasChar(playerMove, word)) {
                    break;
                }
            }
        }

        }
        System.out.println("YOU LOST THE GAME :/");
    }
    static String resultOfPlayerMove(ArrayList <Character> playerMove, String currentWord) {
        String underscore = "_";
        for (int index = 0; index < currentWord.length(); index++) {
            if (playerMove.contains(currentWord.charAt(index))) {
                System.out.print(currentWord.charAt(index));
            }else{
                System.out.print(underscore);
            }
        }
        return underscore;
    }
    static boolean checkIfStringHasChar(ArrayList <Character> playerMove, String currentWord) {
        for (int index = 0; index < currentWord.length(); index++) {
            if (playerMove.contains(currentWord.charAt(index))) {
                return true;
            }
        }
        return false;
    }
    static boolean winningPoint(ArrayList <Character> playerMove, String currentWord) {
        int winningCount = 0;
        for (int index = 0; index < currentWord.length(); index++) {
            if (playerMove.contains(currentWord.charAt(index))) {
            winningCount++;
            }
        }
        return (winningCount == currentWord.length());
    }

}
