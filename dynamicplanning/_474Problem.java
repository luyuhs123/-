package dynamicplanning;

/**
 * @auther luyu
 *
 * 给你一个二进制字符串数组 strs 和两个整数 m 和 n 。
 * 请你找出并返回 strs 的最大子集的长度，该子集中 最多 有 m 个 0 和 n 个 1 。
 * 如果 x 的所有元素也是 y 的元素，集合 x 是集合 y 的 子集 。
 *
 * 输入：strs = ["10", "0001", "111001", "1", "0"], m = 5, n = 3
 * 输出：4
 * 解释：最多有 5 个 0 和 3 个 1 的最大子集是 {"10","0001","1","0"} ，因此答案是 4 。
 * 其他满足题意但较小的子集包括 {"0001","1"} 和 {"10","1","0"} 。{"111001"} 不满足题意，因为它含 4 个 1 ，大于 n 的值 3 。
 */
public class _474Problem {
    public int findMaxForm(String[] strs, int m, int n) {
//        本题依旧是0-1背包，不过背包容量变成了二维形式 有m，n
//        初始化dp
        int[][] dp = new int[100][100];
        for (String str : strs) {
            int zeroNum = 0;
            int oneNum = 0;
            for (int k = 0;k<str.length();k++){
                if('0'==str.charAt(k)) zeroNum++;
                else oneNum++;
            }

            for (int i = m; i >= zeroNum; i--) {
                for (int j = n; j >=oneNum ; j--) {
                    dp[i][j] = Math.max(dp[i][j],dp[i-zeroNum][j-oneNum]+1);
                }
            }
        }
        return dp[m][n];
    }
}
