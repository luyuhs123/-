package array;

/**
 * @auther luyu
 *滑动窗口解决数组问题
 **/
public class _209Problem {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5};
        int target =11;
        int minSubArrayLen = minSubArrayLen(target, nums);
        System.out.println(minSubArrayLen);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum=0;
        for(;right<nums.length;right++){
            if(sum+nums[right]<=target){
                sum+=nums[right];
            }
            else{
                sum+=nums[right];
                while (sum > target) {
                    sum-=nums[left];
                    left++;
                }
                minLength=Math.min(minLength,right-left+2);
            }
            if(sum==target) {
                    minLength=Math.min(minLength,right-left+1);
            }
        }
        return minLength;


    }
}
