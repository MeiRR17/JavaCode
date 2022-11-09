package src;

import java.util.Scanner;
public class SmallestNumUsingMethodsTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = in.nextInt();
        System.out.print("Enter your second number: ");
        int b = in.nextInt();
        System.out.print("Enter your Third number: ");
        int c = in.nextInt();
        int sNum = findSmallestNum(a, b, c);
        System.out.println("Your first number ("+ sNum +") is the smallest number.");


    }
    static int findSmallestNum(int a,int b, int c){
        if(a<=b && a<=c){
            return a;
        }
        else if(b<=a && b<=c){
            return b;
        }else{
            return c;
        }
    }
}