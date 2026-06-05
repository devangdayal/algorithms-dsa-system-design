import java.util.Arrays;

public class Sort012Colors {

    public void sort012(int[] numbers){

        int left =0, middle = 0, right= numbers.length-1;

        while(middle<=right){

            if(numbers[middle] == 0) {
                Swap.swap(numbers, left, middle);
                left++;
                middle++;
            }else if(numbers[middle] ==2 ){
                Swap.swap(numbers,middle,right);
                right--;
            }else{
                middle++;
            }
        }
    }

    static void main(String[] args) {
        int[] numbers = {0,1,2,0,2,1,2,1,1,0,0,1,2,2,1,2,2,1,0,0,0,0,0,0,1,2,2};

        Sort012Colors sort012Colors = new Sort012Colors();
        sort012Colors.sort012(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
