public class Offer21 {

    public static void main(String[] args) {
        int[] test = {1,2,3,4,4,6,9};
        int[] res = exchange(test);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            if (nums[left] % 2 != 0){
                left++;
                continue;
            }
            if (nums[right] % 2 == 0){
                right--;
                continue;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
}
