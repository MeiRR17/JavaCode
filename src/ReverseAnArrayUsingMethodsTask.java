package src;

public class ReverseAnArrayUsingMethodsTask {
    public static void main(String[] args) {
        System.out.print("Reversed array is: ");
        int [] arrNum = {1, 2, 3, 4, 5};
        int [] iFinal = getArrayReversed(arrNum);
        for (int j : iFinal) {
            System.out.print(j + ",");
        }
        System.out.print(".");
    }
    public static int[] getArrayReversed (int [] arr){
        for(int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
}