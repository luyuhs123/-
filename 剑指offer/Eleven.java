package 剑指offer;

/**
 * @auther luyu
 */
public class Eleven {
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length-1;
        while(left<=right){
            if(numbers[left]>numbers[right]){
                left++;
            }
            else {
                return numbers[left];
            }
        }
        return numbers[left];
    }
}
