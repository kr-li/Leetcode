public class Leetcode9 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reverseX = 0;
        while (x > reverseX){
            int pop = x % 10;
            x /= 10;
            reverseX = 10 * reverseX + pop;
        }
        return x == reverseX || x == reverseX / 10;
    }
}
