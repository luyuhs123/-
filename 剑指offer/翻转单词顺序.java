package 剑指offer;

import java.util.Stack;

/**
 * @auther luyu
 */
public class 翻转单词顺序 {
    public static void main(String[] args) {
        String s = "  hello  world!";
        String s1 = reverseWords(s);
        System.out.println(s1);
    }

        /**
         * 方法二直接用栈
         */
        public static String reverseWords(String s) {
            String trim = s.trim();
            String[] s1 = trim.split(" ");
            Stack<String> stack = new Stack<>();
            for (String temp : s1) {
                stack.push(temp);
            }
            StringBuilder sb = new StringBuilder();
            int size = stack.size();
            for (int i=0;i<size;i++) {
                String s2 = stack.pop();
                if(!s2.equals("")){
                    if(i==size-1){
                        sb.append(s2);
                    }
                    else {
                        sb.append(s2).append(" ");
                    }

                }
            }
            return sb.toString();
        }



        /**
         * 方法一，在原char数组上修改难度更大
         */
//        String trim = s.trim();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < trim.length(); i++) {
//            if(trim.charAt(i)==trim.charAt(i-1)&&trim.charAt(i)==' '){
//                continue;
//            }
//            sb.append(trim.charAt(i));
//        }
//        char[] chars = sb.toString().toCharArray();
//        int left = 0;
//        int right = chars.length-1;
////        将整个数组进行倒置
//        reverse(left,right,chars);
////        以空格为分割，进行单词倒置
//        right = 0;
//        while (right< chars.length){
//            if(chars[right]==' '){
//                reverse(left,right-1,chars);
//                left = right+1;
//            }
//            else if(right==chars.length-1){
//                reverse(left,right,chars);
//            }
//            right++;
//        }
//        return new String(chars);

//    public void reverse(int left,int right,char[] chars){
//        while(right>left){
//            int temp = chars[left];
//            chars[left] = chars[right];
//            chars[right] = chars[left];
//            right--;
//            left++;
//        }
//    }
}
