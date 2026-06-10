public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        IsAnagram isAnagram = new IsAnagram();
        String s1 = "nagaram";
        String s2 = "anagram";
        System.out.println(isAnagram.isAnagram(s1, s2));

        s1 = "";
        s2 = "";
        System.out.println(isAnagram.isAnagram(s1, s2));

        s1 = "abced";
        s2 = "abc";
        System.out.println(isAnagram.isAnagram(s1, s2));
    }
}
