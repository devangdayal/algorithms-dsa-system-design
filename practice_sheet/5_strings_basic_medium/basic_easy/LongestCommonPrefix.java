public class LongestCommonPrefix {

    static void main(String[] args) {
        String[] stringArray_1 = {"flower", "flow", "flight"};
        String[] stringArray_2={"dog","racecar","car"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(stringArray_1));
        System.out.println(longestCommonPrefix.longestCommonPrefix(stringArray_2));
    }

    public String longestCommonPrefix(String[] stringArray) {

        if (stringArray == null || stringArray.length == 0) return "";
        String prefix = stringArray[0];
        for (String string : stringArray) {
            while (!string.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
