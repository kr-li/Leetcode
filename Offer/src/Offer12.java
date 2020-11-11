public class Offer12 {
    public static void main(String[] args) {
        char[][] test = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
        String word = "beai";
        boolean ans = exist(test, word);
        System.out.println(ans);
    }

    public static boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dfs(board, words, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    protected static boolean dfs(char[][] board, char[] word, int i, int j, int k){
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word[k]){
            return false;
        }
        if (k == word.length - 1) {
            return true;
        }
        char temp = board[i][j];
        board[i][j] = '/';
        boolean ans = dfs(board, word, i-1, j, k+1) || dfs(board, word, i+1, j, k+1)
                      || dfs(board, word, i, j-1, k+1) ||dfs(board, word, i, j+1, k+1);
        board[i][j] = temp;
        return ans;
    }
}
