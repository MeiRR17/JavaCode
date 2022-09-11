import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLearningSecondTask {
    public static void main(String[] args) {
        //Create array list with values 1 0 3 0 7 9 6 0 2 0 0 9 5 0

        ArrayList<Integer> arrL = new ArrayList<>(Arrays.asList(1, 0, 3, 0, 7, 9, 6, 0, 2 ,0 , 0, 9, 5, 0));

        //Print values

        System.out.print("Without removing 0 integer: ");
        for(int i : arrL){
            System.out.print(i + ", ");
        }
        System.out.println(".");

        //Remove all 0

        for(int i = 0; i<arrL.size(); i++){
            if(arrL.get(i)==0){
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