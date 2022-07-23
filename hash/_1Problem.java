package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @auther luyu
 * 力扣第一题
 * 两数之和，使用hashmap快速查找
 */
public class _1Problem {
    public static void main(String[] args) {
        int []nums = {3,2,4};
        int target = 6;
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap hashMap = new HashMap();
        int []result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            hashMap.remove(i);
            if (hashMap.containsValue(target-nums[i])){
                result[0]=i;
                result[1]=(Integer)hashMap.get(target-nums[i]);
                break;
            }
            hashMap.put(nums[i],i);
        }
        return result;
    }
}
