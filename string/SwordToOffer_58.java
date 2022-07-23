package string;

/**
 * @auther luyu
 */
public class SwordToOffer_58 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        String reverse01 = s.substring(0, n);
        String reverse02 = s.substring(n - 1);
        StringBuilder reverse = sb.append(reverse01).reverse();
        sb.setLength(0);
        reverse.append(sb.append(reverse02).reverse());
        return reverse.reverse().toString();
    }
}
