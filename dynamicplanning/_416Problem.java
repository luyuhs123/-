package dynamicplanning;

import java.util.Arrays;

/**
 * @auther luyu
 * 给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 */
public class _416Problem {
    public boolean canPartition(int[] nums) {
//        建立dp[]数组，此题可以抽象为0-1背包问题，sum/2就是背包容量，数组中的值就是背包价值，而若是最大价值能等于背包容量
//        就可以说是能够找到
//        这里的dp[]数组我们使用滚动数组，即一维数组.含义是当背包容量为j时，最大价值是多少
        int[] dp = new int[10001];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        else sum = sum/2;
//        初始化dp，java中默认全是0，刚好不用初始化了
        for (int i = 0; i < nums.length; i++) {
            for (int j = sum; j >=0 ; j--) {
                if(nums[i]>j) break;
                else dp[j]=Math.max(dp[j],dp[j-nums[i]]+nums[i]);
            }
        }
        if(dp[sum]==sum) {
            return true;
        }
        else return false;

    }
}
