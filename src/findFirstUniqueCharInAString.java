package src;


import java.util.HashMap;
import java.util.Scanner;

public class findFirstUniqueCharInAString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type your String for showing your first unique character.");
        String answer = s.nextLine();
        System.out.println("First unique char in current String: '" + allUnique(answer) + "'.");
    }
    static char allUnique(String sentence) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0;i<sentence.length();i++) {
            char c = sentence.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int index = 0; index<sentence.length();index++) {
            if (map.get(sentence.charAt(index)) == 1)
                return sentence.charAt(index);
        }
         return ' ';
        }
    }
