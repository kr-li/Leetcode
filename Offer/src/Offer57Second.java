import java.util.ArrayList;
import java.util.List;

public class Offer57Second {

    public int[][] findContinuousSequence(int target) {
        int left = 1, right = 1;
        int sum = 0;
        List<int[]> ans = new ArrayList<>();
        while (left <= target / 2){
            if (sum < target){
                sum += right;
                right++;
            }
            else if (sum > target){
                sum -= left;
                left++;
            }
            else {
                int[] arr = new int[right - left];
                for (int i = left; i < right; i++) {
                    arr[i-left] = i;
                }
                ans.add(arr);
                sum -= left;
                left++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
