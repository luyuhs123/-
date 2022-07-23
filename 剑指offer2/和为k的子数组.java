package 剑指offer2;

import java.util.HashMap;

/**
 * @auther luyu
 */
public class 和为k的子数组 {
    public int subarraySum(int[] nums, int k) {
//        前缀和加hashmap
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int prefix = 0;
        int count = 0;
        hashMap.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            if(hashMap.containsKey(prefix-k)){
                count+=hashMap.get(prefix-k);
            }
            hashMap.put(prefix,hashMap.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}
