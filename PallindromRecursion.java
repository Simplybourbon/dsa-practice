public class PallindromRecursion {
    public static boolean checkPallindrome(String s) {
        int i = 0;
        int n = s.length();
        while (i < n) {
            if (i >= n / 2) {
                return true;
            }
            if (s.toLowerCase().replace("[,:]", " ").charAt(i) != s.toLowerCase().replace("[,:]", " ")
                    .charAt(n - i - 1)) {
                return false;
            }
            i++;
        }

        return checkPallindrome(s);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(checkPallindrome(s));
    }
}
