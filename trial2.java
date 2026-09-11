import java.util.ArrayList;
import java.util.HashMap;

public class trial2 {
    public static void main(String[] args) {
        String s = removeDigit("1231", '1');
        System.out.println(s);
    }

    static String removeDigit(String number, char digit) {
        StringBuilder sb = new StringBuilder(number);
        StringBuilder sc = new StringBuilder(number);

        int l = 0;
        int R = sb.length() - 1;
        while (l <= R) {
            if (sb.charAt(R) == digit) {
                sb.deleteCharAt(R);
                break;
            }
            R--;
        }
        while (l <= R) {
            if (sc.charAt(l) == digit) {
                sc.deleteCharAt(l);
                break;
            }
            l++;
        }
        int x = Integer.parseInt(sb.toString());
        int y = Integer.parseInt(sc.toString());
        if (x > y) {
            return sb.toString();
        }

        return sc.toString();

    }
}
