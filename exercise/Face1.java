package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @auther luyu
 * 字节一面  数组中若干数字，不改变数组中数字相对顺序情况下，给你一个数字n，组成一个最大的n位数字
 */
public class Face1 {

    public static void main(String[] args) {
         // 9 1 2  3 4 5 6
        // n=2
    }

    static List<Integer> result = new ArrayList<>();
    public static void maxN(int[] nums,int start,int n){
        if(nums.length-n==0){
            return;
        }
        int Max = -1;
        int index = -1;
        int i = 0;
        for (; i <= nums.length-n; i++) {
            if(nums[i]>Max){
                Max = nums[i];
                index = i;
            }
        }
        result.add(Max);
        maxN(nums,i,n-1);
    }
}
