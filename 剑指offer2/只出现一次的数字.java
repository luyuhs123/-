package 剑指offer2;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther luyu
 */
public class 只出现一次的数字 {
    public static void main(String[] args) {
        int[] a = {0,1,0,1,0,1,99};
        int i = singleNumber(a);
        System.out.println(i);
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length-1; i++) {
            if(hashMap.containsKey(nums[i])){
                Integer integer = hashMap.get(nums[i]);
                hashMap.put(nums[i],integer+1);
            }
            else {
                hashMap.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            if(map.getValue().equals(1)){
                return map.getKey();
            }
        }
        return 0;
    }
}
