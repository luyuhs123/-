package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @auther luyu
 *
 * 判断数组中的交集并去重
 * 使用hashset好
 */
public class _349Promblem {
    public static void main(String[] args) {

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet();
        HashSet<Integer> hashSet1 = new HashSet();
        for (int i = 0; i < nums1.length; i++) {
            hashSet.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(hashSet.contains(nums2[i])){
                hashSet1.add(nums2[i]);
            }
        }
        Integer[] ints = new Integer[hashSet1.size()];
        hashSet1.toArray(ints);
        return Arrays.stream(ints).mapToInt(Integer::valueOf).toArray();
    }
}
