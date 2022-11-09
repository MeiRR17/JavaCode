package src;

public class PerformBubbleSortTask {
    public static void main(String[] args) {
        //Added the sentence that will show up before the sorted array.
        System.out.print("sorted array is: ");
        //Added an array.
        int [] arrNum = {1, 3, 2, 5, 4};
        //Saved the method in arrFinal.
        int [] arrInput = bubbleSort(arrNum);
        //printed the final array in main.
        for(int f : arrInput){
            System.out.print(f + ", ");
        }
        System.out.println(".");
    }
    public static int [] bubbleSort (int [] arr){
        //putted arr's length in an int called "length".
        int length = arr.length;
        //double for statement to get to full sorting.
        for (int i = 0; i < length - 1; i++)
        {
            for (int j = 0;j<length - i - 1;j++) {
                //if statement to see if the numbers needs swapping.
                if (arr[j] > arr[j + 1]) {

                    //Swapped between the elements:
                    //arr[j] took the temporary spot.
                    int temp = arr[j + 1];
                    //arr[j + 1] took place in arr[j] spot.
                    arr[j + 1] = arr[j];
                    //temp became arr[j+1].
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}