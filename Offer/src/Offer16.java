public class Offer16 {
    public static void main(String[] args) {
        double x = myPow(2,-3);
        System.out.println(x);
    }

    public static double myPow(double x, int n) {
        if (n == 0)
            return 1;
        //如果n小于0，把它改为正数，并且把1/x提取出来一个
        if (n < 0)
            return 1 / x * myPow(1 / x, -n - 1);
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }


}