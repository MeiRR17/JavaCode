package src;

import java.util.Scanner;

public class CheckIfAllDigitInAnIntAreEvenUsingMethodsTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to see if all his digits are equals to each other: ");
        int i = in.nextInt();
        boolean bFinal = checkIfAllDigitEquals(i);
        if(bFinal){
            System.out.println("All the digits in the current number are equals.");
        }else{
            System.out.println("Not all the digits in the current number are equals.");
        }
    }
    public static boolean checkIfAllDigitEquals (int number){
        while(number != 0){

            int scannerD = number % 10;
            number /= 10;
            if(scannerD == number){
                return true;
            }
        }
        return false;
    }
}