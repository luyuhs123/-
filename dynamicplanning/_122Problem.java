package dynamicplanning;

/**
 * @auther luyu
 * 类似于121股票问题，不同点在于，股票可以进行重复的买卖
 */
public class _122Problem {
    public int maxProfit(int[] prices) {
//        设置dp数组
        int[][] dp = new int[prices.length][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]-prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],prices[i]+dp[i-1][0]);
        }
        return dp[prices.length-1][1];
    }
}
