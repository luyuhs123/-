package 剑指offer2;

/**
 * @auther luyu
 */
public class 前n个数字二进制中1的个数 {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 0; i <= n; i++) {
            String s = Integer.toBinaryString(i);
            char[] chars = s.toCharArray();
            int count = 0;
            for (char aChar : chars) {
                if (aChar=='1'){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
//方法二，原理是使用x&(x-1)可以使末尾为0，当x=0时的次数就是1的个数
class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            bits[i] = countOnes(i);
        }
        return bits;
    }

    public int countOnes(int x) {
        int ones = 0;
        while (x > 0) {
            x &= (x - 1);
            ones++;
        }
        return ones;
    }
}
