package src;

import java.util.Scanner;

public class MiddleCharacterInAStringUsingMethodsTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = in.nextLine();
        String sFinal = findMiddle(s);
        System.out.println(sFinal);
    }
    public static String findMiddle (String myString) {

        int len = myString.length();
        int middle = len / 2;

        if(len%2!=0){
            myString.charAt(len/2);
            return String.valueOf(myString.charAt(middle));
        }else{
            middle = len/2 - 1;
            return String.valueOf(myString.charAt(middle))+ myString.charAt(middle+1);
        }
    }
}