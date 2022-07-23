package 剑指offer;

/**
 * @auther luyu
 */
public class Ten {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int top = 0;
        int right = matrix[0].length;
        while(right>=0&&top<=matrix.length){
            if(matrix[right][top]==target){
                return true;
            }
            else if(matrix[right][top]>target){
                right--;
            }
            else {
                top++;
            }
        }
        return false;
    }
}
