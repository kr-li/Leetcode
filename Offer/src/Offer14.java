public class Offer14 {
    public static void main(String[] args) {

    }

    public int cuttingRope(int n) {
        if (n < 2) return 0;
        if (n == 2) return 1;
        if (n == 3) return 2;

        int a = n / 3;
        int b = n % 3;
        if (b == 0) return (int)Math.pow(3, a);
        if (b == 1) return (int)Math.pow(3, a-1) * 4;
        return (int)Math.pow(3, a) * 2;
    }
}
