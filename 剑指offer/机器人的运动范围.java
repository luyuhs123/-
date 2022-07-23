package 剑指offer;

/**
 * @auther luyu
 */
public class 机器人的运动范围 {
    public int movingCount(int m, int n, int k) {
        int[][] used = new int[m][n];
        dfs(0,0,m,n,k,used);
        int sum = 0;
        for (int[] ints : used) {
            for (int anInt : ints) {
                if(anInt==1){
                    sum++;
                }
            }
        }
        return sum;
    }
    public void dfs(int i,int j,int m,int n,int k,int[][] used){
        if(isOutRange(i,j,k)){
            return;
        }
        used[i][j] = 1;
        int[][] dire= {{-1,0},{1,0},{0,-1},{0,1}};
        for (int l = 0; l < dire.length; l++) {
            int newI = i+dire[l][0];
            int newJ = j+dire[l][1];
            if(newI>=0&&newI<m&&newJ>=0&&newJ<n&&used[newI][newJ]==0){
                dfs(newI,newJ,m,n,k,used);
            }
        }
    }
    public boolean isOutRange(int i,int j,int k){
        int sum = 0;
        sum+=(i%10+i/10)+(j%10+j/10);
        return sum > k;
    }
}
