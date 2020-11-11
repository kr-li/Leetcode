public class Offer13 {
    public static void main(String[] args) {

    }

    public int movingCount(int m, int n, int k) {
        if (k < 0 || m <= 0 || n <= 0) return 0;
        boolean visited[][] = new boolean[m][n];
        return dfs(0, 0, m, n, k, visited);
    }

    int dfs(int i, int j, int m, int n, int k, boolean[][] visited){
        if (i > m || j > n || k < sum(i, j) || visited[i][j]) return 0;
        visited[i][j] = true;
        return 1 + dfs(i + 1, j, m, n, k, visited) + dfs(i, j + 1, m, n, k, visited);
    }

    int sum(int i, int j){
        int sum = 0;
        while (i != 0){
            sum += i % 10;
            i /= 10;
        }
        while (j != 0){
            sum += j % 10;
            j /= 10;
        }
        return sum;
    }
}
