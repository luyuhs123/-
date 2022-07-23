package dynamicplanning;

/**
 * @auther luyu
 * 不同路径问题,在一个m*n的方格里,从左上角走到右下角的所有方法数目
 */
public class _62Problem {
    public int uniquePaths(int m, int n) {
//        确定dp数组含义,dp为走到某一个点的所有方法数
        int[][] dp = new int[m][n];
//        初始化dp数组
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
