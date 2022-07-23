package 剑指offer;

/**
 * @auther luyu
 */
public class Five {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        String s1 = "%20";
        for (int i = 0; i < s.length(); i++) {
            if(s1.charAt(i)==' '){
                sb.append(s1);
            }
            else {
                sb.append(s1.charAt(i));
            }
        }
        return sb.toString();
    }
}
