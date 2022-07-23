package dynamicplanning;

/**
 * @auther luyu
 * 给你一个由 不同 整数组成的数组 nums ，和一个目标整数 target 。请你从 nums 中找出并返回总和为 target 的元素组合的个数。
 *
 * 题目数据保证答案符合 32 位整数范围。
 *
 *
 *
 *
 */

public class _377Problem {
    public int combinationSum4(int[] nums, int target) {
//        初始化数组，含义为target为n时的最大组合数
        int dp[] = new int[target+1];
        dp[0] = 1;
        for (int i = 1; i <=target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i-nums[j]>=0){
                    dp[i]+=dp[i-nums[j]];
                }
            }
        }
        return dp[target];
    }
}
