package 剑指offer2;

/**
 * @auther luyu
 */
public class 左右两边子数组的和相等 {
    public int pivotIndex(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i-1]+nums[i];
        }
        for (int i = 0; i < sum.length; i++) {
            if(i>0&&(nums[i]+2*sum[i-1])==sum[nums.length-1]){
                return i;
            }
            if(i==0&&nums[i]==sum[nums.length-1]){
                return 0;
            }
        }
        return -1;
    }
}
