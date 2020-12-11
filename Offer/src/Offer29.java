public class Offer29 {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0){
            return new int[0];
        }

        int left = 0, top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int[] ans = new int[(right+1)*(bottom+1)];

        int k = 0;

        while (left <= right && top <= bottom){
            for (int i = left; i <= right; i++) {
                ans[k] = matrix[top][i];
                k++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans[k] = matrix[i][right];
                k++;
            }
            right--;
            for (int i = right; i >= left && top <= bottom;i--){
                ans[k] = matrix[bottom][i];
                k++;
            }
            bottom--;
            for (int i = bottom; i >= top && left <= right; i--){
                ans[k] = matrix[i][left];
                k++;
            }
            left++;
        }
        return ans;
    }
}
