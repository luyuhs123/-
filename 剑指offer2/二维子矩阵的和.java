package 剑指offer2;

/**
 * @auther luyu
 */
public class 二维子矩阵的和 {
    class NumMatrix {
        public int[][] matrix;
        public int[][] prefixSum;
        public NumMatrix(int[][] matrix) {
            this.matrix = matrix;
            if(matrix!=null) {
                int m = matrix.length;
                int n = matrix[0].length;
                prefixSum = new int[m][n];
//            预处理第一行和第一列
                prefixSum[0][0] = matrix[0][0];
                for (int i = 1; i < n; i++) {
                    prefixSum[0][i] = prefixSum[0][i - 1] + matrix[0][i];
                }
                for (int i = 1; i < m; i++) {
                    prefixSum[i][0] = prefixSum[i - 1][0] + matrix[i][0];
                }
                for (int i = 1; i < m; i++) {
                    for (int j = 1; j < n; j++) {
                        prefixSum[i][j] = prefixSum[i-1][j]+prefixSum[i][j-1]-prefixSum[i-1][j-1]+matrix[i][j];
                    }
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
//            二维数组前缀和
            if(prefixSum.length==1){
                return prefixSum[0][col2]-prefixSum[0][col1]+matrix[0][col1];
            }
            else if(prefixSum[0].length==1){
                return prefixSum[row2][0]-prefixSum[row1][0]+matrix[row1][0];
            }
            else {
                if(row1==0&&col1==0){
                    return prefixSum[row2][col2];
                }
                else if(row1==0){
                    return prefixSum[row2][col2]-prefixSum[row2][col1 - 1];
                }
                else if(col1==0){
                   return  prefixSum[row2][col2]-prefixSum[row1 - 1][col2];
                }else {
                    return prefixSum[row2][col2] - prefixSum[row2][col1 - 1] - prefixSum[row1 - 1][col2] + prefixSum[row1 - 1][col1 - 1];
                }
            }
        }
    }
}
