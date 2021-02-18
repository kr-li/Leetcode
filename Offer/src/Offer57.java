import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Offer57 {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(target - nums[i])){
                return new int[] {target - nums[i], nums[i]};
            }
            hashSet.add(nums[i]);
        }
        return new int[] {};
    }

    public int[] twoSum2(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] ans = new int[2];
        while (left <= right){
            if (nums[left] + nums[right] == target){
                ans[0] = nums[left];
                ans[1] = nums[right];
                return ans;
            }
            else if (nums[left] + nums[right] < target){
                left++;
            }
            else {
                right--;
            }
        }
        return ans;
    }
}
