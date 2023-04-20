package src.ArrayTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLearningTask {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String s = in.nextLine();


        int result = uniqueElement(s);
        System.out.println("Your current word has " + result + " unique letters.");
    }
    public static int uniqueElement(String s){
        ArrayList<Character> arrL = new ArrayList<>();
        for(char c :s.toCharArray()) {
            if (!isCharInsideArray(arrL, c)) {
                arrL.add(c);
            }
        }
        return arrL.size();
    }
    public static boolean isCharInsideArray (ArrayList<Character> arr, char c) {
        for(char currentChar : arr){
            if(currentChar==c){
                return true;
            }
        }
        return false;
    }
}