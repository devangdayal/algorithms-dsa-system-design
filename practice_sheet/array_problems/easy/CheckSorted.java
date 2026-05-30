public class CheckSorted {

    public boolean checkIsSorted(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }

    static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 6, 7, 8};
        CheckSorted checkSorted = new CheckSorted();
        System.out.println(checkSorted.checkIsSorted(arr1));
        System.out.println(checkSorted.checkIsSorted(arr2));


    }
}
