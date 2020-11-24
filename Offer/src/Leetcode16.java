import java.util.Arrays;

public class Leetcode16 {
    public static void main(String[] args) {
        int[] test = {-1,2,1,-4};
        threeSumClosest(test, 1);
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(ans - target) > Math.abs(sum - target)){
                    ans = sum;
                }
                if (sum > target){
                    right--;
                }
                else if (sum < target){
                    left++;
                }
                else{
                    return ans;
                }
            }
        }
        return ans;
    }
}
