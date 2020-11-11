public class Offer16 {
    public static void main(String[] args) {
        double x = myPow(2,3);
        System.out.println(x);
    }

    public static double myPow(double x, int n) {
        double result = 1.0;
        for (int i = 1; i <= n; i ++) {
            result *= x;
        }
        return result;
    }


}
