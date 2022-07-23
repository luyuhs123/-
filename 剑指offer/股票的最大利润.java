package 剑指offer;

/**
 * @auther luyu
 */
public class 股票的最大利润 {
    public int maxProfit(int[] prices) {
        /**
         * 第一种内存耗费比较大，其实只有用一个dp[1][2]大小的二维数组即可
         */
//        dp数组的含义dp[i][0]是持有股票的最大现金，dp[i][1]是不持有股票的最大现金
//        int[][] dp = new int[prices.length][2];
//        dp[0][0]=-prices[0];
//        dp[0][1]=0;
//        for (int i = 1; i < prices.length; i++) {
//            dp[i][0]= Math.max(dp[i-1][0],-prices[i]);
//            dp[i][1] = Math.max(dp[i-1][1],prices[i]+dp[i][0]);
//        }
//        return dp[prices.length-1][1];
        int [][] dp = new int[1][2];
        dp[0][0]= -prices[0];
        dp[0][1]=0;
        for (int i = 1; i < prices.length; i++) {
            dp[0][0] = Math.max(dp[0][0],-prices[i]);
            dp[0][1] = Math.max(dp[0][1],prices[i]+dp[0][0]);
        }
        return dp[0][1];
    }
}
