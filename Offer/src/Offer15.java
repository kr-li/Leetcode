public class Offer15 {

    public static void main(String[] args) {
        Offer15 offer15 = new Offer15();
        int x = offer15.hammingWeight(1111110);
        System.out.println(x);
    }

    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0){
            if ((n & 1) == 1){
                ans++;
            }
            n = n >>> 1;
        }
        return ans;
    }
}
