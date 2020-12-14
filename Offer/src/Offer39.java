import java.util.HashMap;

public class Offer39 {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums){
            if (hashMap.containsKey(num)){
                hashMap.put(num, hashMap.get(num) + 1);
            }
            else {
                hashMap.put(num, 1);
            }

            if (hashMap.get(num) > nums.length / 2){
                return num;
            }
        }

        return 0;
    }

    public int majorityElement2(int[] nums){
        int x = 0, vote = 0;
        for (int num : nums){
            if (vote == 0) {
                x = num;
            }
            if (num == x){
                vote++;
            }
            if (num != x){
                vote--;
            }
        }
        return x;
    }
}
