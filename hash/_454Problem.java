package hash;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @auther luyu
 * 给定四个数组，每个数组去一个树，四数之和相加，使得和=0；求这样的元祖有多少个
 * 使用hashMap，保存前两个数组和的所有情况，并且这个情况每出现一次就加一
 * 再在后俩数组中找到0-sum的和的情况
 *
 */
public class _454Problem {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        int[] nums1 = {1,2};
        int[] nums2 = {-2,-1};
        int[] nums3 = {-1,2};
        int[] nums4 = {0,2};
        int count = fourSumCount(nums1, nums2, nums3, nums4);
        System.out.println(count);
    }
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap hashMap = new HashMap();
        int count = 0;
        int length = nums1.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int sum = nums1[i]+nums2[j];
                if(!hashMap.containsKey(sum)){
                    hashMap.put(sum,1);
            }
                else {
                    int value = (int)hashMap.get(sum);
                    hashMap.replace(sum,(value+1));
                }
        }
    }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int sum = nums3[i]+nums4[j];
                if(hashMap.containsKey(0-sum)){
                    count += (int)hashMap.get(0-sum);

                }
            }
        }
        return count;
}
}
