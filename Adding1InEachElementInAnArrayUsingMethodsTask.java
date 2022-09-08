public class Adding1InEachElementInAnArrayUsingMethodsTask {
    public static void main(String[] args) {

        //see if git's working rn

        //print what you want to say without moving to the next line:
        System.out.println("Printing all the array but we will add one to each element: ");
        //Put an arr in main:
        int [] arrFinal = {1, 2, 3, 4, 5};
        //Save the array from method in main, so we can perform in main the printing:
        int [] iInput = addOne(arrFinal);
        //print the input array we want to see the adding 1 in each one of the elements:
        for (int j : iInput){
            System.out.print(j + ",");
        }
        System.out.print(".");
    }
    //Create a method to perform what we need:
    public static int [] addOne (int [] arr){
        //Create a for statement to perform the adding one process:
        for(int i=0;i<arr.length;i++) {
            arr[i] = arr[i] + 1;
        }
        //Return to main:
        return arr;
    }
}