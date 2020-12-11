public class Leetcode27 {

    public int removeElement(int[] nums, int val) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[left] = nums[i];
                left++;
            }
        }
        return left;
    }
}
