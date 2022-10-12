import java.util.HashMap;

public class SecondTask{
    public static void main(String[] args) {
        System.out.println(combineHashMap());
    }
    public static HashMap<Character, Integer> combineHashMap() {

        HashMap<Character, Integer> HM1 = new HashMap<>();

        HashMap<Character, Integer> HM2 = new HashMap<>();

        HashMap<Character, Integer> map = new HashMap<>();

        HM1.put('A', 1);
        HM1.put('B', 2);
        HM1.put('C', 3);
        HM1.put('D', 4);

        HM2.put('A', 2);
        HM2.put('D', 3);
        HM2.put('C', 4);
        HM2.put('E', 5);

        for (Character s : HM1.keySet()) {
            for(Character c : HM2.keySet()) {
                if (HM2.containsKey(s)) {
                    map.put(s, HM1.get(s) + HM2.get(s));
                } else if(HM1.containsKey(c)){
                    map.put(s, HM1.get(s));
                }else{
                    map.put(c, HM1.get(s));

                }
            }
        }
        return map;
    }
}
