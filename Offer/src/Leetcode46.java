public class Leetcode46 {

    public int translateNum(int num) {
        String src = String.valueOf(num);
        int p = 0, q = 0, res = 1;
        for (int i = 0; i < src.length(); i++) {
            p = q;
            q = res;
            res = 0;
            res += q;
            if (i == 0) continue;
            String pre = src.substring(i-1, i+1);
            if (pre.compareTo("25") <= 0 && pre.compareTo("10") >= 0){
                res += p;
            }
        }
        return res;
    }

    /**
     * 动态规划
     * @param num
     * @return
     */
    public int translateNum2(int num){
        String s = String.valueOf(num);
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            dp[i] += dp[i-1];
            int temp = Integer.parseInt(s.substring(i-1, i+1));
            if (temp >= 10 && temp <= 25){
                if (i == 1){
                    dp[i] += 1;
                }
                else {
                    dp[i] += dp[i-2];
                }
            }
        }
        return dp[s.length() - 1];
    }
}
