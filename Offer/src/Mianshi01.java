import java.util.HashSet;

public class Mianshi01 {
    public boolean isUnique(String astr) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            if (hashSet.contains(astr.charAt(i))){
                return false;
            }
            hashSet.add(astr.charAt(i));
        }
        return true;
    }
}
