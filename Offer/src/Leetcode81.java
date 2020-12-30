public class Leetcode81 {

    public boolean search(int[] nums, int target){
        if (nums.length == 0){
            return false;
        }
        int start = 0, end = nums.length - 1;
        while (start <= end){
            int mid = (start + end) >> 1;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[start] == nums[mid]) {
                start++;
                continue;
            }
            if (nums[start] < nums[mid]){
                if (nums[mid] > target && nums[start] <= target) {
                    end = mid - 1;
                } else {  //否则，去后半部分找
                    start = mid + 1;
                }
            }else {
                //后半部分有序
                //target在后半部分
                if (nums[mid] < target && nums[end] >= target) {
                    start = mid + 1;
                } else {  //否则，去后半部分找
                    end = mid - 1;

                }
            }
        }
        return false;
    }
}
