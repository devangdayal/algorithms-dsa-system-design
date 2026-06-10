public class ReverseWord {
    static void main(String[] args) {
        String string = "the sky is blue";
        ReverseWord reverseWord = new ReverseWord();
        System.out.println(reverseWord.reverseWords(string));
    }

    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
