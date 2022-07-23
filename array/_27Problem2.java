package array;

/**
 * @auther luyu
 * 快慢指针删除数组中指定元素
 */
public class _27Problem2 {
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 3;
        int i = removeElement(nums, val);
        System.out.println(i);
        for (int num : nums) {
            System.out.print(num);
        }
    }
    public static int removeElement(int[] nums, int val){
        int length = nums.length;
//        定义快慢指针
        int slowFlag = 0;
        int fastFlag = 0;
        while(fastFlag<length){
            if(nums[fastFlag]!=val&&(fastFlag==slowFlag)){
                fastFlag++;
                slowFlag++;
            }
            else if(nums[fastFlag]==val){
                fastFlag++;
            }
            else {
                nums[slowFlag]=nums[fastFlag];
                slowFlag++;
                fastFlag++;
            }
        }
        return slowFlag;
    }
}
