package array;

/**
 * @auther luyu
 */
public class _35Problem {
    static class Solution {
        public static   int searchInsert(int[] nums, int target) {
            int length = nums.length;
            if(target>nums[length-1]){
                return length;
            }
            if(target<nums[0]){
                return 0;
            }
            int left  = 0;
            int right = length-1;
            int middle = 0;
            if(length==1){
                if(target>nums[0]){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            while(left<right){
                middle = left+(right-left)/2;
                if(target==nums[middle]){
                    return middle;
                }
                else if(nums[middle]>target){
                    if(right==middle){
                        break;
                    }
                    right=middle;
                }
                else {
                    if(left==middle){
                        break;
                    }
                    left=middle;
                }
            }
            return middle+1;
        }

        public static void main(String[] args) {
            int nums[] = {1,3,5,7};
            int target = 2;
            int i = searchInsert(nums, target);
            System.out.println(i);

        }
    }
}
