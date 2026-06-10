import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] nums){

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() ==1){
                return entry.getKey();
            }
        }


        return -1;
    }

    static void main(String[] args) {
        int[] numbers = {4,1,2,1,2};

        SingleNumber singleNumber= new SingleNumber();

        System.out.println(singleNumber.singleNumber(numbers));


    }
}
