package 剑指offer2;

/**
 * @auther luyu
 */
public class 二进制加法 {
    public String addBinary(String a, String b) {
//        这个变量来记录进位
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        char[] la = a.toCharArray();
        char[] lb = b.toCharArray();
        int top,bottom;
        for (int i = la.length-1,j=lb.length-1;i>=0||j>=0; i--,j--) {
            top = i>=0?Character.getNumericValue(la[i]):0;
            bottom = j>=0?Character.getNumericValue(lb[j]):0;
            int sum = top+bottom;
            sb.append((sum+carry)%2);
            carry = (sum+carry)/2;
        }
        if(carry==1){
            sb.append("1");
        }
        return sb.reverse().toString();
    }
}
