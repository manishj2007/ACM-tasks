public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babcsd";
        String best = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub) && sub.length() > best.length()) {
                    best = sub;
                }
            }
        }

        System.out.println("Input: " + s);
        System.out.println("Longest palindrome: " + best);
    }

    static boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
