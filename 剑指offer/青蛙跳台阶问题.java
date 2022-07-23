package 剑指offer;

/**
 * @auther luyu
 */
public class 青蛙跳台阶问题 {
    public int numWays(int n) {
//        典型的动态规划问题，第n阶台阶可以从第n-1跳一格或者n-2跳两格实现
//        1、设dp数组，含义为跳到n阶台阶时的最大跳法
        int[] dp =  new int[n+1];
        dp[0] = 0;
        dp[1] = 1 ;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
            dp[i]%=1000000007;
        }
        return dp[n];
    }
}
