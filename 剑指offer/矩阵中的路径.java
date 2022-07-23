package 剑指offer;

/**
 * @auther luyu
 */
public class 矩阵中的路径 {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        int[][] used = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = backTracking(i, j, used, board, word, 0);
                if(flag){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean backTracking(int i,int j,int[][]used,char[][]board,String word,int k){
        if(word.charAt(k)!=board[i][j]){
            return false;
        }
        if(k==word.length()-1){
            return true;
        }
        Boolean result = false;
        used[i][j] = 1;
        int[][] around = {{0,-1},{-1,0},{0,1},{1,0}};
        for (int l = 0; l < around.length; l++) {
            int newI = i + around[l][0];
            int newJ = j + around[l][1];
            if(newI>=0&&newI<board.length&&newJ>=0&&newJ<board[0].length){
                if(used[newI][newJ]==0){
                    boolean flag = backTracking(newI, newJ, used, board, word, k + 1);
                    if(flag){
                        result = true;
                        break;
                    }
                }
            }
        }
        used[i][j] = 0;
        return result;
    }
}
