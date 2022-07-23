package dynamicplanning;

/**
 * @auther luyu
 * 给定一个数组 prices ，它的第i个元素prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 * 输入：[7,1,5,3,6,4]
 * 输出：5
 * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 */
public class _121Problem {
    public int maxProfit(int[] prices) {
//        确定dp[][]数组  ，dp数组含义 dp[i][0]持有股票所得的最大现金.dp[i][1]不持有股票所得的最大现金
        int[][] dp = new int[1000001][2];
//        初始化dp数组
        dp[0][0] -= prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(-prices[i],dp[i-1][0]);
            dp[i][1] = Math.max(prices[i]+dp[i-1][0],dp[i-1][1]);
        }
        return dp[prices.length-1][1];

    }
}
