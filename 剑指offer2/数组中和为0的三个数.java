package 剑指offer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther luyu
 */
public class 数组中和为0的三个数 {
    public static void main(String[] args) {
        int[] a = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        threeSum(a);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                break;
            }
            if(i>=1&&nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(nums[left]+nums[right]+nums[i]<0){
                    left++;
                }
                else if(nums[left]+nums[right]+nums[i]>0){
                    right--;
                }
                else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);
                    while (left < right && nums[left] == nums[left + 1]) {left++;}
                    left++;
                    }
                }

            }
        return result;
    }

}
