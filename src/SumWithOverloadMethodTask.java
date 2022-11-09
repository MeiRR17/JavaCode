package src;

public class SumWithOverloadMethodTask {
    public static void main(String[] args) {
        //saved with adding numbers to the ints.
        int printSumOfTwo = sumNum(1, 2);
        int printSumOfThree = sumNum(1, 2, 3);
        int printSumOfFour = sumNum(1, 2, 3, 4);
        //printed the result.
        System.out.println("Sum of two current number is :" + printSumOfTwo + ".");
        System.out.println("Sum of three current number is :" + printSumOfThree + ".");
        System.out.println("Sum of four current number is :" + printSumOfFour + ".");
    }
    //sum two ints.
    public static int sumNum(int x, int y){
        return x + y;
    }
    //sum three ints.
    public static int sumNum(int x, int y, int z){
        return x + y + z;
    }
    //sum four ints.
    public static int sumNum(int x, int y, int z, int t){
        return x + y + z + t;
    }
}