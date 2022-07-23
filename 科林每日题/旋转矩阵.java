package 科林每日题;

/**
 * @auther luyu
 */
public class 旋转矩阵 {
    public void rotate(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        int n = newMatrix.length;
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                newMatrix[n-i-1][i]=matrix[i][j];
            }
        }
        matrix=newMatrix;
    }
}
