import java.util.HashMap;

public class Offer48 {

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int start = -1;
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])){
                start = Math.max(start, map.get(chars[i]));
            }
            map.put(chars[i], i);
            ans = Math.max(ans, i - start);
        }
        return ans;
    }
}
