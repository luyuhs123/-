package weekTest;

/**
 * @auther luyu
 */
public class 网格中的最小路径代价 {
    static int  result = Integer.MAX_VALUE;
    public int minPathCost(int[][] grid, int[][] moveCost) {
        backTracking(grid,0,0,moveCost);
        return result;
    }
    public static void backTracking(int[][] grid,int start,int min,int[][] moveCost){
        if(start==grid.length){
            result = Math.min(result,min);
            return;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                min+=grid[start][i]+moveCost[grid[start][i]][j];
                backTracking(grid,start+1,min,moveCost);
                min-=grid[start][i]+moveCost[grid[start][i]][j];
            }
        }
    }
}
