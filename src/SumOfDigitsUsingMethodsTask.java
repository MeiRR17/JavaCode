package src;

import java.util.Scanner;

public class SumOfDigitsUsingMethodsTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = in.nextInt();
        int result = countSumOfDigits(input);
        System.out.println("The sum of digits is: " + result);
    }
    public static int countSumOfDigits(int d){
        int sum = 0;

        while (d != 0) {
            sum += d % 10;
            d /= 10;
        }
        return sum;
    }
}