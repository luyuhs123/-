package 剑指offer;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @auther luyu
 */
public class Seven {
    public int findRepeatNumber(int[] nums) {
        HashSet set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return nums[i];
            }
            else {
                set.add(nums[i]);
            }
        }
        return -1;
    }
}
