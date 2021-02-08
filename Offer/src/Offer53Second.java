public class Offer53Second {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) >> 1;
            if (mid == nums[mid]){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return left;
    }
}
