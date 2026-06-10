public class RemoveOutermostParenthesis {
    static void main(String[] args) {
        String string = "(()())(())(()(()))";
        RemoveOutermostParenthesis removeOutermostParenthesis = new RemoveOutermostParenthesis();
        System.out.println(removeOutermostParenthesis.removeOutermostParenthesis(string));
    }

    public String removeOutermostParenthesis(String str) {

        StringBuilder stringBuilder = new StringBuilder();
        int depth = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) {
                    stringBuilder.append("(");
                }
                depth++;
            } else {
                depth--;
                if (depth > 0) {
                    stringBuilder.append(")");
                }
            }
        }
        return stringBuilder.toString();
    }

}
