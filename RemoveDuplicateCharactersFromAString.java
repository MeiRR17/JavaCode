import java.util.Scanner;

public class RemoveDuplicateCharactersFromAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type your String to see what it is like when you erase duplicate characters: ");
        String s = in.nextLine();

        System.out.println("Current String without duplicate characters: " + scannerOutput(s) + ".");

    }
    static boolean checkIfThereIsALetter(String word, char letter){
        for(int index = 0;index<word.length();index++){
            if(word.charAt(index) == letter){
                return true;
            }
        }
        return false;
    }
    static String scannerOutput(String word){
        String newWord = "";

        for(int index = 0;index<word.length();index++){
            if(!checkIfThereIsALetter(newWord, word.charAt(index))){
                newWord+=word.charAt(index);
            }
        }
        return newWord;
    }
}
