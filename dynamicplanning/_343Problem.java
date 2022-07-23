package dynamicplanning;

/**
 * @auther luyu
 * 一个数拆分成>=2的整数，算出他所有组合中最大的乘积
 * 动态规划   dp数组意味着最大的乘积
 * 动态关系为   max{dp[i],max{(i-j)*j,dp[i-j]*j}}  (i-j)*j为某个数拆穿两个数的乘积 而后面的dp[i-j]*j为多个数与j的乘积
 */
public class _343Problem {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[2] = 1;
        for (int i = 3; i <= n ; i++) {
            for (int j = 1; j < i-1; j++) {
                dp[i] = Math.max(dp[i],Math.max((i-j)*j,dp[i-j])*j);
            }
        }
        return dp[n];
    }
}
