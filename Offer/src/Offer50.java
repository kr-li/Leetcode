import java.util.HashMap;

public class Offer50 {

    public char firstUniqChar(String s) {
        if (s.length() == 0) return ' ';
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if (map.containsKey(arr[i])){
                int x = map.get(arr[i]);
                map.put(arr[i], x+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        for (char c: arr) {
            if (map.get(c) == 1){
                return c;
            }
        }
        return ' ';
    }
}
