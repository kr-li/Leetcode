import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode15 {
    public static void main(String[] args) {

        int[] test = {-4,-1,-1,0,1,2};
        List<List<Integer>> ans = threeSum(test);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if (len < 3 || nums == null) return ans;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) return ans;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1;
            int right = len - 1;
            while (left < right){
                if (nums[i] + nums[left] + nums[right] == 0){
                    List<Integer> item = new ArrayList<>();
                    item.add(nums[i]);
                    item.add(nums[left]);
                    item.add(nums[right]);
                    ans.add(item);
                    while (left < right && nums[left+1] == nums[left]) left++;
                    while (left < right && nums[right-1] == nums[right]) right--;
                    left++;
                    right--;
                }
                else if (nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return ans;
    }
}
