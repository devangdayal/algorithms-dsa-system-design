public class RotateStrings {

    static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        RotateStrings rotateStrings= new RotateStrings();
        System.out.println(rotateStrings.rotateStrings(s,goal));
    }

    public boolean rotateStrings(String s, String goal){
        if(s.length()!= goal.length()){
            return false;
        }

        return (s+s).contains(goal);
    }
}
