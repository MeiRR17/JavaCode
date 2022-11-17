package src;

import java.util.Scanner;

public class FindFirstUniqueCharWithoutHashMap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type your String for showing your first unique character.");
        String answer = s.nextLine();
        System.out.println("First unique char in current String: '" + allUnique(answer) + "'.");
    }
    static char allUnique(String sentence) {
        boolean check;
        for (int i = 0; i < sentence.length(); i++) {
            check = false;
            for (int j = i; j < sentence.length(); j++) {
                if (i != j) {
                    if (sentence.charAt(j) == sentence.charAt(i)) {
                        check = true;
                        break;
                    }
                }
            }
            if (!check) {
                return sentence.charAt(i);
            }
        }
        return ' ';
    }
}
