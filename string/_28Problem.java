package string;

/**
 * @auther luyu
 * 本题是对KMP算法的实现，作用是字符串匹配
 */
public class _28Problem {
    public static void main(String[] args) {
        String needle = "issip";

        String hayStack = "mississippi";
        int i = strStr(hayStack, needle);
        System.out.println(i);
    }
//    正式匹配字符串
    public static int strStr(String haystack, String needle) {
        int[] nextTable = getNextTable(needle);
        for (int i : nextTable) {
            System.out.println(i);
        }
        for (int i = 0, j=0; i < haystack.length(); i++) {
            while(j>=0&&haystack.charAt(i)!=needle.charAt(j+1)){
                j=nextTable[j];
            }
            if(haystack.charAt(i)==needle.charAt(j+1)){
                j++;
            }
            if(j==(needle.length()-1)){
                return (i-needle.length()+1);

            }
        }
        return -1;
    }
//    先由模式串生成next前缀表
    public static int[] getNextTable(String needle){
        int[] nextTable = new int[needle.length()];
//        我对算出最大前缀的想法：双指针，
//        错了，前缀后缀并不是相反 比如ABAB 最大前后缀匹配为2  前缀为ABA   后缀BAB  AB为最大匹配前缀


//        1.初始化数组第一个位置
//        j为前缀的末尾  i为后缀的末尾
        int j = -1;
        nextTable[0]=j;
        for (int i = 1; i < needle.length(); i++) {
//            2.当出现needle[i]和needle[j]不同的情况
            while(j>=0&&needle.charAt(j+1)!=needle.charAt(i)){
                j=nextTable[j];
            }
            if(needle.charAt(j+1)==needle.charAt(i)){
                j++;
            }
            nextTable[i]=j;
        }
        return nextTable;
    }
}
