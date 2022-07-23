package 顺丰周赛;

/**
 * @auther luyu
 */
public class 收件节节高 {
     public static void main(String[] args) {
        int[] a =  {54,42,62,75,82,86,86};
        int maxCI = findMaxCI(a);
        System.out.println(maxCI);
    }
    static int findMaxCI(int[] nums) {
        int max = 0;
        int left = 0;
        int right = 0;
        while(right<=nums.length-1){
            if(right+1<nums.length&&nums[right]<nums[right+1]){
                right++;
            }
            else {
                max = Math.max(max,(right-left+1));
                right++;
                left=right;
            }
        }
        return max;
    }
}
