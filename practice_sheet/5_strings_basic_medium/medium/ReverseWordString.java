public class ReverseWordString {
    static void main(String[] args) {
        String string = "The sky is blue in color";
        ReverseWordString reverseWordString = new ReverseWordString();
        System.out.println(reverseWordString.reverseWordString(string));


    }

    public String reverseWordString(String string) {
        if (string == null || string.length() < 1) return "";

        StringBuilder stringBuilder = new StringBuilder();

        String[] array = string.split("\\s+");

        for (int i = array.length - 1; i >= 0; i--) {
            stringBuilder.append(array[i]);
            if (i != 0) stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }

}
