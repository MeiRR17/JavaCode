package src;

import java.util.ArrayList;

public class ArrayListLearningSecondTask {
    public static void main(String[] args) {
        //Create array list with values 1 0 3 0 7 9 6 0 2 0 0 9 5 0
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(1);
        arrL.add(0);
        arrL.add(3);
        arrL.add(0);
        arrL.add(7);
        arrL.add(9);
        arrL.add(6);
        arrL.add(0);
        arrL.add(2);
        arrL.add(0);
        arrL.add(0);
        arrL.add(9);
        arrL.add(5);
        arrL.add(0);
        //Print values
        System.out.print("Without removing 0 integer: ");
        for(int i : arrL){
            System.out.print(i + ", ");
        }
        //Remove all 0
        System.out.println(".");
        for(int i = 0; i< arrL.size(); i++){
            if(arrL.get(i) ==0){
                arrL.remove(arrL.get(i));
            }
        }
        //Print values again
        System.out.print("With removing 0 integer: ");
        for(int i : arrL){
            System.out.print(i + ", ");
        }
        System.out.print(".");
    }
}
