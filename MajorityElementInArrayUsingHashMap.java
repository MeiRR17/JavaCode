import java.util.HashMap;


public class MajorityElementInArrayUsingHashMap {
    public static void main(String[] args){
        int[] arr = new int[]{2, 2, 2, 0, 5, 5, 4, 3, 3};
        HashMap<Integer, Integer> mapFinal = findFrequentNum(arr, arr.length);
        for (int i : mapFinal.keySet()) {

        }
    }
    public static HashMap<Integer, Integer> findFrequentNum(int [] arrI, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int current ;
        for (int i : arrI){
            if (map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        for(int j : arrI){
            if (max < map.get()){
                current = map.get();
                max = map.get();
            }
        }

        }
        return map;
    }
}