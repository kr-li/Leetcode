public class Offer53 {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
        int leftK = findFirstK(nums, target);
        int rightK = findLastK(nums, target);
        if (leftK == -1 && rightK == -1) return 0;
        return rightK - leftK + 1;
    }

    private int findFirstK(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) >> 1;
            if (nums[mid] == target){
                if (mid > 0 && nums[mid - 1] == target){
                    right = mid - 1;
                }
                else {
                    return mid;
                }
            }
            else if (nums[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private int findLastK(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) >> 1;
            if (nums[mid] == target){
                if (mid < nums.length - 1 && nums[mid + 1] == target){
                    left = mid + 1;
                }
                else {
                    return mid;
                }
            }
            else if (nums[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
