package string;

/**
 * @auther luyu
 *
 *将字符串中的空格替换成指定的字符串
 */
public class SwordToOffer_05 {
    public String replaceSpace(String s) {
        String replace = "%20";
        int length = s.length();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                length += replace.length();
            }
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append(replace);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
