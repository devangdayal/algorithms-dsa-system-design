import java.util.Arrays;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        Arrays.fill(map1, -1);
        Arrays.fill(map2, -1);

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map1[ch1] == -1 && map2[ch2] == -1) {
                map1[ch1] = ch2;
                map2[ch2] = ch1;
            } else if (!(map1[ch1] == ch2 && map2[ch2] == ch1)) {
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        String s1 = "";
        String s2 = "";

        IsIsomorphic isIsomorphic = new IsIsomorphic();
        System.out.println(isIsomorphic.isIsomorphic(s1, s2));
    }
}
