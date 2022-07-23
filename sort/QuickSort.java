package sort;

/**
 * @auther luyu
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5, 9, 1, 9, 5, 3, 7, 6, 1};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(nums,0,nums.length-1);

        for (int i : nums) {
            System.out.println(i);
        }
    }
    public  void quickSort(int nums[],int start,int end){
        if(start<end) {
            int chosen = nums[start];
            int i = start;
            int j = end;
            while(i<j) {
                while (i < j && nums[j] > chosen) {
                    j--;
                }
                if (i < j) {
                    nums[i]=nums[j];
                    i++;
                }
                while (i < j &&nums[i] < chosen) {
                    i++;
                }
                if(i<j){
                    nums[j]=nums[i];
                    j--;
                }
            }
            nums[i]=chosen;
            if(i>0) {
                quickSort(nums, start, i - 1);
            }
            quickSort(nums,i+1,end);
        }
    }
}
