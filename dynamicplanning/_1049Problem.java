package dynamicplanning;

/**
 * @auther luyu
 *每一回合，从中选出任意两块石头，然后将它们一起粉碎。假设石头的重量分别为x 和y，且x <= y。那么粉碎的可能结果如下：
 *
 * 如果x == y，那么两块石头都会被完全粉碎；
 * 如果x != y，那么重量为x的石头将会完全粉碎，而重量为y的石头新重量为y-x。
 * 最后，最多只会剩下一块 石头。返回此石头 最小的可能重量 。如果没有石头剩下，就返回 0。
 *
 */
public class _1049Problem {
//    本题的解法还是动态规划，尽量将石头分成大小相等的两堆，所以背包容量则为 sum/2 ，抽象为0-1背包问题了
//    求背包容量下的最大价值（这里是重量）
    public int lastStoneWeightII(int[] stones) {
//            初始化dp[]数组，依旧使用滚动数组，一维初始化方便，数组大小取决于题干
        int[] dp = new int[15001];
        int sum = 0;
        for (int i = 0; i < stones.length; i++) {
            sum+=stones[i];
        }
        int target = sum/2;
        for (int i = 0; i < stones.length; i++) {
            for (int j = target; j >= stones[i] ; j--) {
                dp[j] = Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return (sum-dp[target])-dp[target];
    }
}
