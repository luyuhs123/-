package weekTest;

/**
 * @auther luyu
 */
public class 公平分发饼干 {
    public int distributeCookies(int[] cookies, int k) {
        int sum = 0;
        for (int i = 0; i < cookies.length-1; i++) {
            sum+=cookies[i];
        }
        int average = sum/k;
        int[][] dp = new int[average+1][cookies.length];
//        赋初值
        for (int i = 0; i < average; i++) {
            if(i<cookies[0]){
                dp[0][i]=0;
            }
            else {
                dp[0][i] = cookies[0];
            }
        }
        for (int i = 0; i < cookies.length-1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i < cookies.length; i++) {
            for (int j = 0; j <= average; j++) {
                if(j<cookies[i]){
                    dp[i][j] = dp[i-1][j];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-cookies[i]]+cookies[i]);
                }
            }
        }
        return dp[average][cookies.length-1];
    }
}
