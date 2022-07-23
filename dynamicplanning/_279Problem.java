package dynamicplanning;

/**
 * @auther luyu
 *
 * 给你一个整数 n ，返回 和为 n 的完全平方数的最少数量 。
 *
 * 完全平方数 是一个整数，其值等于另一个整数的平方；换句话说，其值等于一个整数自乘的积。例如，1、4、9 和 16 都是完全平方数，而 3 和 11 不是。
 *
 * 输入：n = 12
 * 输出：3
 * 解释：12 = 4 + 4 + 4
 * 示例 2：
 *
 * 输入：n = 13
 * 输出：2
 * 解释：13 = 4 + 9
 *
 */
public class _279Problem {
    public int numSquares(int n) {
//        设dp为n时最小平方个数
        int dp[] = new int[n+1];
        for (int i = 3; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0]=0;
        dp[1]=1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= 100; j++) {
                if(i-j*j>0){
                    dp[i] = Math.min(dp[i],dp[i-j*j]+1);
                }
                if(i-j*j==0){
                    dp[i]=1;
                }
            }
        }
        return dp[n];
    }

}
