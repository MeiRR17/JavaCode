public class SumWithOverloadMethodTask {
    public static void main(String[] args) {
        //saved with adding numbers to the ints.
        int printSumOfTwo = sumOfTwoInts(1, 2);
        int printSumOfThree = sumOfThreeInts(1, 2, 3);
        int printSumOfFour = sumOfFourInts(1, 2, 3, 4);
        //printed the result.
        System.out.println("Sum of two current number is :" + printSumOfTwo + ".");
        System.out.println("Sum of three current number is :" + printSumOfThree + ".");
        System.out.println("Sum of four current number is :" + printSumOfFour + ".");
    }
    //sum two ints.
    public static int sumOfTwoInts(int x, int y){
        return x + y;
    }
    //sum three ints.
    public static int sumOfThreeInts(int x, int y, int z){
        return x + y + z;
    }
    //sum four ints.
    public static int sumOfFourInts(int x, int y, int z, int t){
        return x + y + z + t;
    }
}