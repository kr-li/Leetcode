public class Mianshi05 {

    public boolean oneEditAway(String first, String second) {
        int firstLen = first.length();
        int secondLen = second.length();
        int[][] dp = new int[firstLen + 1][secondLen + 1];
        //当第一个字符串为""
        for (int j = 1; j <= secondLen; j++) {
            dp[0][j] = j;
        }
        //当第二个字符串为""
        for (int i = 1; i <= firstLen; i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i <= firstLen; i++) {
            for (int j = 1; j <= secondLen; j++) {
                if (first.charAt(i-1) == second.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    //有三种情况，删除，增加，替换(两个长度相等时候就进行替换)
                    //各种操作加一的最小值，就是最小编辑次数
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + 1);
                }
            }
        }
        if(dp[firstLen][secondLen]>1){
            return false;
        }
        return true;
    }
}
