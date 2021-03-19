import java.util.HashMap;
import java.util.Map;

public class Mianshi02 {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s1.length(); i++) {
            if (map1.get(s1.charAt(i)) != map2.get(s1.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
