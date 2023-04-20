package src;

import java.util.HashMap;

    public class MajorityElementInArrayUsingHashMap{
        public static void main(String[] args){
            int[] arr = new int[]{2, 2, 2, 0, 5, 5, 4, 3, 3};
            int [] savedArr = findFrequentNumAndCount(arr);
            System.out.println("The answer is: " + savedArr[0] + ". Because this number is " + savedArr[1] + " times inside the array.");
        }

        public static int [] findFrequentNumAndCount(int [] arrI){

            HashMap <Integer, Integer> map = new HashMap<>();
            int maxElement = arrI[0];
            int maxCount = 0;

            for (int i : arrI){
                if (map.containsKey(i)){
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }

            for(int key : arrI){
                if (maxCount < map.get(key)){
                    maxElement = key;
                    maxCount = map.get(key);
                }
            }
            return new int[]{maxElement, maxCount};
        }
    }