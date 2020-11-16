public class Leetcode11 {

    public static void main(String[] args) {
        int[] height = {1,1};
        int max = maxArea(height);
        System.out.println(max);
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;

        int i = 0, j = height.length - 1;
        while (i < j){
            maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }

}
