package src;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a char to reveal more the answer: ");

        ArrayList<Character> playerMove = new ArrayList<>();
        String word = "Dog";
        word = word.toLowerCase();

        int NumOfGuesses = 0;
        int NumOfGuessesLeft = 7;




        while(true) {String guess = in.nextLine();playerMove.add(guess.charAt(0));
//        int checking = 0;
//        while(guess.length()>1) {
//            System.out.println("Couldn't figure what you typed, please enter only one character.");
//                checking = 1;
//                break;
//
//        }
//        if(checking==1){
//            continue;
//        }


        resultOfPlayerMove(playerMove, word);
        System.out.println();

        if(winningPoint(playerMove, word)){
            System.out.println("Great! You won the game!");
            break;
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////
        if(!checkIfStringHasChar(playerMove, word)) {
            NumOfGuessesLeft--;

            if (NumOfGuessesLeft > 2) {
                System.out.println("Ohh, you missed that one please be calm, you have plenty of guesses left;)");
            } else if (NumOfGuessesLeft > 1) {
                System.out.println("Okay, seems like you could use a friend hand for this one!");
            } else if (NumOfGuessesLeft > 0) {
                System.out.println("Told you to use your friend...");
            } else if (NumOfGuessesLeft == 0) {
                System.out.println("Mhm, I think I had to bet for your lost.");
            }
        }else{
            System.out.print("True! There is the character '");
            showChar(playerMove, word);
            System.out.println("' in the current word.");
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////
        NumOfGuesses++;
        if (NumOfGuesses == 8) {
            break;
        }
        System.out.println("You have " + NumOfGuessesLeft + " guesses left.");

        }
        if(!winningPoint(playerMove, word)) {
            System.out.println("YOU LOST THE GAME :/");
        }
    }
    static void resultOfPlayerMove(ArrayList <Character> playerMove, String currentWord) {
        for (int index = 0; index < currentWord.length(); index++) {
            if (playerMove.contains(currentWord.charAt(index))) {
                System.out.print(currentWord.charAt(index));
            }else{
                System.out.print("_");
            }
        }
    }
    static boolean checkIfStringHasChar(ArrayList <Character> playerMove, String currentWord) {
        for(int i = 0;i<currentWord.length();i++){
            if(playerMove.contains(currentWord.charAt(i))){
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
    static void showChar(ArrayList <Character> playerMove, String currentWord) {
        for (int i = 0; i < currentWord.length(); i++) {
            if (playerMove.contains(currentWord.charAt(i))) {
                System.out.print(currentWord.charAt(i));            }
        }

    }
}
