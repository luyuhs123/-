package 顺丰周赛;

/**
 * @auther luyu
 */
public class 小哥派件装载问题 {
    public static void main(String[] args) {
        int[] N={8, 2, 12, 7, 9, 7};
        int V = 11;
        int i = minRemainingSpace(N, V);
        System.out.println(i);
    }
    public static int minRemainingSpace(int[] N, int V) {
//        动态规划
//        总共最长2000，所以我们设置数组长为2001
        int deep[][] = new int[31][2001];
//        初始化数组
        for(int i = N[0];i<=V;i++){
            deep[0][i] = N[0];
        }
        for (int i = 0;i<N.length;i++){
            deep[i][0] = 0;
        }
        for (int j = 0;j<=V;j++){
            for (int i = 1; i < N.length; i++) {
                if(j<N[i]){
                    deep[i][j] = deep[i-1][j];
                }
                else {
                    deep[i][j] = Math.max(deep[i-1][j],deep[i-1][j-N[i]]+N[i]);
                }
            }
        }
        return V-deep[N.length-1][V];
    }
}
