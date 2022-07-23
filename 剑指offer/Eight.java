package 剑指offer;

import java.util.HashMap;

/**
 * @auther luyu
 */
public class Eight {
    public int search(int[] nums, int target) {
        /**
         * 这是第一种方法hash表很慢
         */
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(nums[i])){
                Integer integer = hashMap.get(nums[i]);
                hashMap.put(nums[i],integer+1);
            }
            else {
                hashMap.put(nums[i],1);
            }
        }
        if(hashMap.containsKey(target)){
            return hashMap.get(target);
        }
        else {
            return 0;
        }
        /**
         * 第二种先排序然后使用二分查找
         */
    }
}
