package 剑指offer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther luyu
 */
public class 扑克牌中的顺子 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        while(input.hasNextLine()){
            str = input.nextLine();
            System.out.println(str);
        }
    }
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for (i = nums.length-1; i >=0; i++) {
            if (nums[i]==0){
                break;
            }
            if(i>=1&&nums[i]==nums[i-1]){
                return false;
            }
        }
        return nums[nums.length - 1] - nums[i + 1] <= 4;
    }
}
