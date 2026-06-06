import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutiveSequence(int[] nums){
        int maxLen = 0;

        Set<Integer> set = new HashSet<>();

        for(int num: nums) {
            set.add(num);
        }

        for(int num : set){

            if(!set.contains(num-1)){

                int current = num;
                int length = 1;

                while (set.contains(current+1)){
                    length++;
                    current++;
                }

                maxLen = Math.max(maxLen,length);
            }


        }


        return maxLen;
    }


    static void main(String[] args) {
        int[] numbers = {0,3,7,2,5,8,4,6,0,1};

        LongestConsecutiveSequence longestConsecutiveSequence= new LongestConsecutiveSequence();

        System.out.println(longestConsecutiveSequence.longestConsecutiveSequence(numbers));


    }
}
