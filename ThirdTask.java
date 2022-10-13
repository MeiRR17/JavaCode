import java.util.Arrays;
import java.util.HashMap;

public class ThirdTask {
    public static void main(String[] args){
        int[] arr = new int[]{2, 0, 2, 0, 5, 5, 4, 3, 5};
        findFrequentNumAndCount(arr);
    }

    public static void findFrequentNumAndCount(int[] arrI){
        Arrays.sort(arrI);
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        //put the array inside the HashMap
        for (int i : arrI){
            //if there is this number, then add 1
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }else{
                //else, if there is no such number, then add it with value of one
                map.put(i, 1);
            }
        }

        //find the most frequent number

        System.out.print("Most frequent number(s): ");

        for (int key : arrI){
            if (maxCount < map.get(key)){
                maxCount = map.get(key);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) == maxCount){
                System.out.print(key + ", ");
            }
        }
        //find the least frequent number

        System.out.println();
        System.out.print("Least frequent number(s): ");
        int minCount = arrI.length;
        for (int key : map.keySet()){
            if (map.get(key) < minCount) {
                minCount = map.get(key);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) == minCount){
                System.out.print(key + ", ");
            }
        }
        System.out.println(".");
    }
}