package src;

import java.util.Arrays;

public class SortedArrayUsingMethodsTask {
    public static void main(String[] args) {
        System.out.print("Array returned from method that is sorted: ");
        int [] arrNum = {3, 1, 4, 2};
        int [] iFinal = sortedArray(arrNum);
        for(int i = 0;i<iFinal.length;i++){
            System.out.print(iFinal[i] + ",");
        }
        System.out.println(".");
    }
    public static int [] sortedArray (int [] arr){
        Arrays.sort(arr);
        return arr;
    }
}
