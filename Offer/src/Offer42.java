public class Offer42 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        Offer42 offer42 = new Offer42();
        int a = offer42.maxSubArray(arr);
        System.out.println(a);
    }

    /**
     * 动态规划
     * 1.状态，即子问题。
     * dp[i] 代表以元素 nums[i] 为结尾的连续子数组最大和。
     *
     * 2.转移策略，自带剪枝。
     * 若 dp[i−1]≤0 ，说明 dp[i−1] 对 dp[i] 产生负贡献，即 dp[i−1]+nums[i] 还不如 nums[i] 本身大。
     *
     * 3.状态转移方程，根据前两步抽象而来。
     *
     * 当 dp[i−1]>0 时：执行 dp[i] = dp[i-1] + nums[i]；
     * 当 dp[i−1]≤0 时：执行 dp[i] = nums[i] ；
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i-1] <= 0) {
                dp[i] = nums[i];
            }
            else {
                dp[i] = dp[i-1] + nums[i];
            }
        }
        int max = 0;
        for (int x:
             dp) {
            max = Math.max(x, max);
        }
        return max;
    }
}
