package 剑指offer;

/**
 * @auther luyu
 */
public class 和为s的两个数字 {
    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        int[] ints = twoSum(a, 9);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int[] result = new int[2];
        while (right>left){
            if(nums[left]+nums[right]==target){
                nums[0] = nums[left];
                nums[1] = nums[right];
                return result;
            }
            else if(nums[left]+nums[right]>target){
                right--;
            }
            else {
                left++;
            }
        }
        return result;
    }
}
