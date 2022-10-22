import java.util.Arrays;

public class UsingCoppiedArrayAndForLoop {
    public static void main(String[] args) {
        int[] integerArr = {1, 2, 3, 4};
        int[] reversedArr = reverseArrayUsingCoppiedOne(integerArr);
        System.out.println("Reversed array: " + Arrays.toString(reversedArr) + ".");
    }
    static int [] reverseArrayUsingCoppiedOne(int[] arr){

        //new array will be the same size as the original
        int[] newArr = new int[arr.length];

        //for loop to reversed copy to the new array

        for(int index = 0; index < arr.length;index++){
            newArr[index] = arr[arr.length - index -1];
        }
        return newArr;
    }
}
