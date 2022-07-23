package array;

/**
 * @auther luyu
 */
public class _27Problem {
    public static void main(String[] args) {
        int nums[] = {3,3};
        int val = 3;
        int i = removeElement(nums, val);
        System.out.println(i);
        for (int num : nums) {
            System.out.print(num);
        }
    }
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        if(length==1){
            if(nums[0]==val){
                return 0;
            }
        }
        int flag = -1;
        boolean end = true;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val){
                flag = i;
                end=true;
                for (int j = flag; j < nums.length; j++) {
                    if(nums[j]!=val){
                        int temp = nums[flag];
                        nums[flag]=nums[j];
                        nums[j]=temp;
                        end=false;
                        break;
                    }
                }
                if(end==true){
                    length-=(nums.length- flag);
                break;
                }
            }
        }
        return length;
    }
}
