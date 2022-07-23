package 科林每日题;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @auther luyu
 */
public class 找出数组中两个不重复的值 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,5,6,6,7,7};
//        1.先找到两个不重复值得异或结果
        int diff = diff(nums);
//        2.然后找到N最低为1的位（假设是J位）
        int j =0;
        while((diff&1)!=1){
            diff = diff>>1;
            j++;
        }
        int[] result = new int[2];

        // 倒数最j位为1的集合
        List<Integer> int1 = new LinkedList<>();
        // 倒数最j位为0的集合
        List<Integer> int2 = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if ((1 & nums[i] >> j) == 1) {
                int1.add(nums[i]);
                // 直接异或
                result[0]^=(nums[i]);
            } else {
                int2.add(nums[i]);
                // 直接异或
                result[1]^=(nums[i]);
            }
        }
        System.out.println("倒数最j位为1的集合" + int1);
        System.out.println("倒数最j位为0的集合" + int2);

        System.out.println("结果集合" + Arrays.toString(result));
    }
    public static int diff(int[] nums){
        int res = -1;
        res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res = res^nums[i];
        }
        return res;
    }
}
