import java.util.HashMap;
import java.util.Map;

public class Mianshi04 {

    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Character ch : map.keySet()) {
            if (map.get(ch) % 2 != 0){
                count++;
            }
        }
        return count <= 1;
    }
}
