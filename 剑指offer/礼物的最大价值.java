package 剑指offer;

/**
 * @auther luyu
 */
public class 礼物的最大价值 {
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
//        dp数组的含义是当处于dp[i][j]时的最大价值
        int[][] dp = new int[m][n];
        dp[0][0]=0;
//        初始化，应该初始化第一行和第一列
        for (int i = 1; i < n; i++) {
            dp[0][i] = grid[0][i]+dp[0][i-1];
        }
        for (int i = 1; i < m; i++) {
            dp[i][0] = grid[i][0]+dp[i-1][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j-1]+grid[i][j],dp[i-1][j]+grid[i][j]);
            }
        }
        return dp[m-1][n-1];
        
    }
}
