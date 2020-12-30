import java.util.HashSet;

public class Leetcode128 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }

        int ans = 0;
        for (int num : set){
            if (!set.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)){
                    currentNum += 1;
                    currentStreak += 1;
                }
                ans = Math.max(ans, currentStreak);
            }
        }
        return ans;
    }
}
