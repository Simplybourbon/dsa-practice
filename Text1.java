import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Text1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = maxNumberOfBalloons("krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw");
        System.out.println(" number of baloons formed : " + x);
    }

    static int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != 'b' && text.charAt(i) != 'a' && text.charAt(i) != 'n' && text.charAt(i) != 'l'
                    && text.charAt(i) != 'o') {
                continue;
            }
            hm.put(text.charAt(i), hm.getOrDefault(text.charAt(i), 0) + 1);

        }
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.print(entry.getKey() + " -> " + entry.getValue() + " ");
        }
        
        int b = hm.getOrDefault('b', 0);
        int a = hm.getOrDefault('a', 0);
        int l = hm.getOrDefault('l', 0);
        int o = hm.getOrDefault('o', 0);
        int n = hm.getOrDefault('n', 0);
        int counter = 0;
        while (b >= 1 && a >= 1 && n >= 1 && l >= 2 && o >= 2) {
            l -= 2;
            o -= 2;// Subtract 2
            a -= 1;
            n -= 1;
            b -= 1;
            counter++; // Increase count
        }
        return counter;
       /* if ((b == a) && (a == n) && (l / 2 == b) && (o / 2 == b)) {
            return b;
        }*/ 

        
    }
}
