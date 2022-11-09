package src;

import java.util.Scanner;

public class CheckIfAllCharactersInAWordAreVowelsUsingMethodsTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you word: ");
        String input = in.nextLine();
        boolean sFinal = checkIfAllCharactersAreVowels(input);

        if(sFinal){
            System.out.println("All the characters are vowels.");
        }else{
            System.out.println("Not all the characters are vowels.");
        }
    }
    public static boolean checkIfAllCharactersAreVowels (String s) {
        int i;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'e' && s.charAt(i) != 'o' && s.charAt(i) != 'u' && s.charAt(i) != 'i' &&
                    s.charAt(i) != 'a' && s.charAt(i) != 'E' && s.charAt(i) != 'O' && s.charAt(i) != 'U' &&
                    s.charAt(i) != 'I' && s.charAt(i) != 'A') {
                return false;
            }
        }
        return true;
    }
}