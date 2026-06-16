public class CountDepthParenthesis {
    public int countDepthParenthesis(String string) {
        int maxDepth = 0;
        int depth = 0;

        for(char ch : string.toCharArray()){
            if(ch=='('){
                depth++;
                maxDepth = Math.max(maxDepth,depth);
            }else if(ch==')'){
                depth--;
            }
        }
        return maxDepth;

    }

    static void main(String[] args) {
        String string = "(1+(2*3)+((8)/4))+1";
        CountDepthParenthesis countDepthParenthesis = new CountDepthParenthesis();
        System.out.println(countDepthParenthesis.countDepthParenthesis(string));
        string = "()((((()))))((()(())))";
        System.out.println(countDepthParenthesis.countDepthParenthesis(string));
    }
}
