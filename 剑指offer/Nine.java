package 剑指offer;

/**
 * @auther luyu
 */
public class Nine {
    public int missingNumber(int[] nums) {
// 记住一句话有序就先想到二分 找到第一个下表和数值不符合的就行
        int left = 0;
        int right = nums.length-1;
        while(right>=left){
            int middle = right - (right-left)/2;
            if(middle==nums[middle]) left=middle+1;
            else{
                right = middle-1;
            }
        }
        return left;
    }
}
