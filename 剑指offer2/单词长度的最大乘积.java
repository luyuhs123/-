package 剑指offer2;

/**
 * @auther luyu
 */
public class 单词长度的最大乘积 {
    /**
     * 一个字符串可以用一个26位的数保存
     * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 可以使用位运算若当前字符是a就将最后以为置为1
     * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
     * 可以使用式子 1<<(char-'a')即1向左移n位，最后与其他字符串做与运算，若大于0则有相同的数
     *
     */
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] bitmasks = new int[n];
        for (int i = 0; i < n; i++) {
            char[] temp = words[i].toCharArray();
            int bitmask = 0;
            for (char c : temp) {
                bitmask|=1<<(c-'a');
            }
            bitmasks[i]=bitmask;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if((bitmasks[i]&bitmasks[j])==0){
                    ans = Math.max(ans,words[i].length()*words[j].length());
                }
            }
        }
        return ans;
    }
}
