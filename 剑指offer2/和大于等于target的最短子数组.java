package 剑指offer2;

import java.util.Arrays;

/**
 * @auther luyu
 */
public class 和大于等于target的最短子数组 {
    public static void main(String[] args) {
        int[] a =
                {2,3,1,2,4,3};
        int i = minSubArrayLen(7, a);
    }
    public static int minSubArrayLen(int target, int[] nums) {
       int left = 0;
       int right = left+1;
       int min = Integer.MAX_VALUE;
       int sum = nums[0];
       while(right<nums.length){
           if(sum<target){
               sum+=nums[right];
               right++;
           }
           while(sum>=target) {
               min = Math.min(min, right - left);
               sum -= nums[left];
               left++;
           }
       }
       if(left==0) min=0;
       return min;

    }
}
