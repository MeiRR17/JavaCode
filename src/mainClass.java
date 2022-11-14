package src;

import java.util.*;

public class mainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Character> playerMove = new ArrayList<>();
        String [] strArray = randomWordAndDescription();

        String word = strArray[0];
        System.out.println(word);
        int NumOfGuessesLeft = 7;
        System.out.println("""
                Playing Hangman:
                                
                Hangman is an old school favorite, a word game where the goal is simply to
                find the missing word or words.

                You will be presented with a number of blank spaces representing the missing
                letters you need to find.

                Use the keyboard to guess a letter (I recommend starting with vowels).

                If your chosen letter exists in the answer, then all places in the answer
                where that letter appear will be revealed.

                After you've revealed several letters, you may be able to guess what the
                answer is and fill in the remaining letters.

                Be warned, every time you guess a letter wrong you loose a life out of 7.
                
                Solve the puzzle before the hangman dies!
                                
                PRESS Enter FOR PLAYING...""");

        in.nextLine();
        System.out.println("Your current word's subject is " + strArray[1] + ".");
        in.nextLine();
        System.out.println("Type a char to reveal more the answer:");
        resultOfPlayerMove(playerMove, word);

        System.out.println();
        while(true) {
            String guess = in.nextLine();
            playerMove.add(guess.charAt(0));
            int checking = 0;

            while(guess.length()>1) {
                System.out.println("Couldn't figure out what you typed, please enter only one character.");
                checking = 1;
                break;
            }
            if(checking==1){
                continue;
            }

            resultOfPlayerMove(playerMove, word);
            System.out.println();

            if(winningPoint(playerMove, word)){
                System.out.println("Wow! You won the game!");
                break;
            }

            if(!word.contains(guess)) {
                NumOfGuessesLeft--;

            if (NumOfGuessesLeft > 2) {
                System.out.println("Ohh, you missed that one, don't worry about it so much, you still have plenty of guesses left;)");
            } else if (NumOfGuessesLeft > 1) {
                System.out.println("Okay, seems like you could use a friend hand for this one!");
            } else if (NumOfGuessesLeft > 0) {
                System.out.println("Told you to use your friend...");
            } else if (NumOfGuessesLeft == 0) {
                System.out.println("Mhm, I think I had to bet for your losing.");
            }
            }else{
                System.out.print("True! There is the character '");
                showChar(playerMove, word);
                System.out.println("' in the current word.");
            }
            if (NumOfGuessesLeft == -1) {
                System.out.println("YOU LOST THE GAME :/");
                break;
            }
            System.out.println("You have " + NumOfGuessesLeft + " guesses left.");
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

                System.out.print(currentWord.charAt(i));
            }
        }
    }
    static String [] randomWordAndDescription() {
        HashMap<String, String> map = new HashMap<>();
        map.put("puma", "Animals");
        map.put("monkey", "Animals");
        map.put("black", "Colors");
        map.put("white", "Colors");
        map.put("israel", "Countries");
        map.put("georgia", "Countries");

        Set<String> keySet = map.keySet();
        ArrayList<String> keyList = new ArrayList<>(keySet);

        int randomIndex = new Random().nextInt(keyList.size());
        String [] returnSeveralNumbers = new String[2];
        returnSeveralNumbers[0] = keyList.get(randomIndex);
        returnSeveralNumbers[1] = map.get(returnSeveralNumbers[0]);

        return returnSeveralNumbers;
    }
}
