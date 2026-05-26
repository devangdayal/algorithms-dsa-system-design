
class TowerOfHanoi{

    private void towerOfHanoi(int n, int from, int to, int aux){
        if(n == 1){
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }

        towerOfHanoi(n-1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        towerOfHanoi(n-1, aux, to, from);
    }

    public static void main(String[] args) {
        
        System.out.println("Enter the number of disks: ");
        int n = new java.util.Scanner(System.in).nextInt();
        int from = 1;
        int to = 3;

        TowerOfHanoi toh = new TowerOfHanoi();
        toh.towerOfHanoi(n, from, to, 2);

    }

}