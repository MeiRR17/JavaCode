package src;

import java.util.Scanner;
public class CheckWhetherEveryDigitInAnIntIsEvenUsingMethodTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type your number: ");
        int i = in.nextInt();
        boolean bFinal = checkInt(i);
        if (bFinal){
            System.out.println("All  digits are even.");
        }else{
            System.out.println("There is one digits or more that is odd.");
        }
    }
    public static boolean checkInt(int number){
        int lastD = number % 10;

        while (number != 0){
            int lastDigit = number % 10;
            number /= 10;

            if(lastD != lastDigit){
                return false;
            }
        }
        return true;
    }
}
