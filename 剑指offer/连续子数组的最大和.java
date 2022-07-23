package 剑指offer;

import java.util.Arrays;

/**
 * @auther luyu
 */
public class 连续子数组的最大和 {
    public int maxSubArray(int[] nums) {
//        dp数组的含义是，到nums[i]的最大和 那样我们就可以推出转移方程。
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i],dp[i]);
        }
        Arrays.sort(dp);
        return dp[nums.length-1];
    }
}
