import java.util.HashMap;

public class ThirdTask {
    public static void main(String[] args){
        int[] arr = new int[]{2, 2, 2, 0, 5, 5, 4, 3, 0};
        int[] savedArr = findFrequentNumAndCount(arr);
        System.out.println("Most frequent number is: " + savedArr[0] + ". Because this number is " + savedArr[1] + " times inside the array.");
        System.out.println("Least frequent number is: " + savedArr[2] + ". Because this number is " + savedArr[3] + " times inside the array.");
    }

    public static int[] findFrequentNumAndCount(int[] arrI){

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxElement = arrI[0];
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
        for (int key : arrI){
            if (maxCount < map.get(key)){
                maxElement = key;
                maxCount = map.get(key);
            }
        }
        int minElement = arrI[0];
        int minCount = arrI.length;
        //find the least frequent number
        for (int key : map.keySet()){
            if (map.get(key) < minCount) {
                minCount = map.get(key);
                minElement = key;
            }
        }
            return new int[]{maxElement, maxCount, minElement, minCount};
        }
    }