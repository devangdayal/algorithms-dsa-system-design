public class CharPyramid {

    public void charPyramid(int n){
        for(int i = 1; i<=n;i++){
            char ch = 'A';
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public void charBoundaryPyramid(int n){

        for(int i = 1; i<=n;i++){
            char ch = 'A';
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j== 2*i-1){
                    System.out.print('A');
                }else {
                    System.out.print(ch);
                }
                ch++;
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {

        int n = 5;
        CharPyramid charPyramid = new CharPyramid();
        charPyramid.charPyramid(n);
        charPyramid.charBoundaryPyramid(n);

    }
}
