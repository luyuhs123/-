package 剑指offer;

/**
 * @auther luyu
 */
public class 调整数组顺序使奇数位于偶数前面 {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            while(left<right&&!isOdd(nums[left])){
                left++;
            }
            while(left<right&&isOdd(nums[right])){
                right--;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
    public boolean isOdd(int num){
        if(num%2==0) {return true;}
        else {return false;}
    }
}
