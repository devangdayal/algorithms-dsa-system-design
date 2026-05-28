public class CharacterTriangle {

    private void charTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    private void charRepeatTriangle(int n) {

        char ch = 'A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }

    private void charReverseTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + n - i);

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 30;
        CharacterTriangle characterTriangle = new CharacterTriangle();
        characterTriangle.charTriangle(n);
        characterTriangle.charRepeatTriangle(n);
        characterTriangle.charReverseTriangle(n);
    }
}
