import java.util.*;

public class MajorityElement_II {

    static void main(String[] args) {
        MajorityElement_II majorityElement = new MajorityElement_II();

        int[] numbers = {1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 7, 8, 9, 10};
        System.out.println(majorityElement.majorityElementN3(numbers));

        numbers = new int[]{1};
        System.out.println(majorityElement.majorityElementN3(numbers));

        numbers = new int[]{1, 2};
        System.out.println(majorityElement.majorityElementN3(numbers));

    }

    public List<Integer> majorityElementN3(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();


        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num) > nums.length/3){
                set.add(num);
            }
        }
        return  new ArrayList<>(set);
    }
}
