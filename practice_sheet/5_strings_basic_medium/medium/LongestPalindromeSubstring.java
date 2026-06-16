public class LongestPalindromeSubstring {

    static void main(String[] args) {
        String string = "racecar";
        LongestPalindromeSubstring longestPalindromeSubstring = new LongestPalindromeSubstring();
        System.out.println(longestPalindromeSubstring.longestPalindromeSubString(string));
        string = "xabba";
        System.out.println(longestPalindromeSubstring.longestPalindromeSubString(string));

    }


    public String longestPalindromeSubString(String str) {
        if (str == null || str.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < str.length(); i++) {
            int l1 = expandAroundCenter(str, i, i); // For Racecar cases, odd
            int l2 = expandAroundCenter(str, i, i + 1); // For Abba cases, even
            int len = Math.max(l1, l2);
            if (len > end - start) {
                start = i - ((len - 1) / 2);
                end = i + len / 2;

            }
        }

        return str.substring(start, end + 1);

    }


    public int expandAroundCenter(String s, int l, int r) {
        if (s == null || l > r) return 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        return r - l - 1;

    }
}
