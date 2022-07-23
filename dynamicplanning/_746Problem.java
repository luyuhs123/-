package dynamicplanning;

/**
 * @auther luyu
 *跳楼梯的变形,可以从0或者1开始跳,任意一节楼梯开跳都需要花费体力值,可以跳一格或者两格
 * 给一个花费数组cost[]
 * 求到达顶端的最小花费是多少
 */
public class _746Problem {
    public int minCostClimbingStairs(int[] cost) {
//      设置dp数组
        int[] dp = new int[cost.length];
//        初始化数组
        dp[0] = cost[0];
        dp[1] = cost[1];
//        确定遍历顺序
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i-1],dp[i-2])+cost[i];
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}
