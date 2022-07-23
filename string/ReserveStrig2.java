package string;

/**
 * @auther luyu
 * 力扣541 翻转字符串2
 *
 * reverse（）方法只在Stringbuilder和StringBuffer中存在，substirng（）范围前取后不取
 */
public class ReserveStrig2 {
    public static void main(String[] args) {
        String s = "abcdefg";
        String s1 = reverseStr(s, 2);
        System.out.println(s1);
    }
    public static String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i+=2*k){
            if(i+k<s.length()){
                String substring = s.substring(i, i + k );
                sb.append(new StringBuilder(substring).reverse());
                if(i+2*k<s.length()) {
                    sb.append(s.substring(i + k, i + 2 * k ));
                }
                else sb.append(s.substring(i+k));
            }
            else {
                String substring = s.substring(i);
                sb.append(new StringBuilder(substring).reverse());
            }
            ;

        }
        return sb.toString();
    }
}
