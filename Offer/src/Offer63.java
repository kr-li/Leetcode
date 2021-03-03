public class Offer63 {
    public int maxProfit(int[] prices) {
        int ans = 0, minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
            else if (prices[i] - minPrice > ans){
                ans = prices[i] - minPrice;
            }
        }
        return ans;
    }

    //test
    public int maxProfit2(int[] prices){
        int[] dp = new int[prices.length];
        int minPrice = prices[0];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = prices[i];
        }
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            if (minPrice > dp[i]) minPrice = dp[i];
            dp[i] = Math.max(dp[i-1], dp[i] - minPrice);
        }
        return dp[dp.length - 1];
    }
}
