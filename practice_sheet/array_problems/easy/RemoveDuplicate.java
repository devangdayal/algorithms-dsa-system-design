import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {


    public void removeDuplicate(String[] arr) {

        HashSet<String> set = new HashSet<>();
        int index = 0;

        for (String st : arr) {
            if (!set.contains(st)) {
                set.add(st);
                arr[index] = st;
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = "_";
            index++;
        }

    }

    static void main(String[] args) {
        String[] arr1 = {"1", "1", "2", "2", "3", "3", "3", "3", "4", "5"};

        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        removeDuplicate.removeDuplicate(arr1);
        System.out.println(Arrays.toString(arr1));


    }
}
