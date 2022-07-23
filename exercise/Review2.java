package exercise;

/**
 * @auther luyu
 */
public class Review2 {

    public void quickSort(int[] nums,int start,int end){
        int i = start;
        int j = end;
//        默认以第一个数为初始量
        int chosen = i;
        while(i<j){
            while(i<j&&nums[j]>nums[chosen]){
                j--;
            }
            if(i<j){
                nums[i] = nums[j];
                i++;
            }
            while(i<j&&nums[i]<nums[chosen]) {
                i++;
            }
            if(i<j){
                nums[j]=nums[i];
                j--;
            }
        }
        nums[i] = chosen;
        quickSort(nums,0,i-1);
        quickSort(nums,i+1,end);

    }
}
