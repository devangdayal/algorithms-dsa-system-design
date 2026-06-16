import java.util.HashMap;
import java.util.Map;

public class CountNumSubstring {

    static void main(String[] args) {
        String string = "pqpqs";
        int k = 2;
        CountNumSubstring countNumSubstring = new CountNumSubstring();
        System.out.println(countNumSubstring.countNumberSubstringValidK(string, k));
    }

    public int countNumberSubstringValidK(String string, int k) {
        return atMostDistinctK(string, k) - atMostDistinctK(string, k - 1);

    }

    public int atMostDistinctK(String string, int k) {
        int left = 0, result = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for (int right = 0; right < string.length(); right++) {
            freq.put(string.charAt(right), freq.getOrDefault(string.charAt(right), 0) + 1);

            while (freq.size() > k) {
                char leftChar = string.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) freq.remove(leftChar);
                left++;
            }
            result += (right - left + 1);
        }
        return result;

    }
}
