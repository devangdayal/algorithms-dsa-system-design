import java.util.Arrays;

public class MaxConsecutiveOnes {

    public int maxConsecutiveOnes(int[] nums){

        int n = nums.length;
        int ones = 0;
        int maxOnes = 0;

        for(int num:nums){
            if(num==1){
                ones++;
                maxOnes=Math.max(maxOnes,ones);
            }else{
                ones=0;
            }
        }
        return maxOnes;
    }


    static void main(String[] args) {
        int[] numbers = {1,1,0,1,1,1};
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int maxOnes = maxConsecutiveOnes.maxConsecutiveOnes(numbers);
        System.out.println(Arrays.toString(numbers) +" = "+ maxOnes );

    }
}
