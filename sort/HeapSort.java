package sort;

/**
 * @auther luyu
 */
public class HeapSort {
    public static void main(String[] args) {
        int nums[] = {54,59,23,8,11,56,101,3};
        realHeap(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void realHeap(int[] nums){
        if(nums==null||nums.length==0){
            return;
        }
        int length = nums.length;
        buildHeap(nums);
        for (int i = length-1; i >= 0 ; i--) {
            swap(nums,0,i);
            length--;
            doHeap(nums,0,length);
        }
    }


//    构造一个初始大顶堆对应的数组
    public static void buildHeap(int[] nums){
        for (int i = nums.length/2-1; i >=0 ; i--) {
            doHeap(nums,i, nums.length);
        }
    }

//    将某一个节点进行排序，直到其子节点也符合大顶堆
    public static void doHeap(int[] nums,int i,int length){
        int left  = 2*i+1;
        int right = 2*i+2;
//        设置当前节点为最大的节点
        int largest = i;
        if(left<length&&nums[left]>nums[largest]){
            largest = left;
        }
        if(right<length&&nums[right]>nums[largest]){
            largest = right;
        }
//        换完以后还要判断他的子节点是否符合大顶堆
        if(largest!=i){
            swap(nums,i,largest);
            doHeap(nums,largest,length);
        }
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
