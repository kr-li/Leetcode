public class Mianshi08 {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length, colomn = matrix[0].length;
        boolean rowHasZero = false, colomnHasZero = false;

        for (int i = 0; i < row; i++){
            if (matrix[i][0] == 0){
                colomnHasZero = true;
            }
        }
        for (int j = 0; j < colomn; j++){
            if (matrix[0][j] == 0){
                rowHasZero = true;
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < colomn; j++) {
                if (matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < colomn; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            if (colomnHasZero){
                matrix[i][0] = 0;
            }
        }
        for (int j = 0; j < colomn; j++) {
            if (rowHasZero){
                matrix[0][j] = 0;
            }
        }

    }
}
