package 科林每日题;

/**
 * @auther luyu
 */
public class 找出数组中唯一不同值 {
    public static void main(String[] args) {
        int res = -1;
        int[] nums = {1,1,2,2,3,5,5,6,6};
        res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res = res^nums[i];
        }
        System.out.println(res);
    }
}
