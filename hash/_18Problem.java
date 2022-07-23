package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther luyu
 * 四数之和，使用hash虽然也能做但是去重判断会很麻烦
 * 这里使用的是双指针法，具体是使用两个for循环加上一个while，while里的条件则是right》left
 * 要求不能有重复的元祖，因此需要先进行排序，将n^4的时间复杂度降为n^3
 *
 */
public class _18Problem {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
//            如果第一个就大于目标，直接返回空
            if(nums[i]>=target){
                return null;
            }
//去重操作，当前的和前一个若相同则跳过
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for (int j = i+1; j < nums.length ; j++) {
//再进行一次去重操作
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int left = j+1;
                int right = nums.length-1;
                while(right>left){
                    if (nums[i]+nums[j]+nums[left]+nums[right]>target){
                        right--;
                    }
                    else if(nums[i]+nums[j]+nums[left]+nums[right]<target){
                        left++;
                    }
                    else {
                        List temp = new ArrayList();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        result.add(temp);
                        while(right>left&&nums[right]==nums[right-1]){
                            right--;
                        }
                        while(right>left&&nums[left]==nums[left]){
                            left++;
                        }
                        right--;
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
