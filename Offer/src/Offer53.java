public class Offer53 {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = 0;
        while (left <= right){
            int mid = (left + right) >> 1;
            if (mid == target){
                ans++;
            }
            if (target < nums[mid]){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
