import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharacterByFrequency {
    static void main(String[] args) {
        SortCharacterByFrequency sortCharacterByFrequency = new SortCharacterByFrequency();
        String s = "tree";
        System.out.println(sortCharacterByFrequency.sortCharacterByFrequency(s));
        s = "aabbbbbccccccccaa";
        System.out.println(sortCharacterByFrequency.sortCharacterByFrequency(s));
        s = "aabbbbbccccccccaae";
        System.out.println(sortCharacterByFrequency.sortCharacterByFrequency(s));
    }

    public String sortCharacterByFrequency(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        PriorityQueue<Character> priorityQueue = new PriorityQueue<>(
                (a, b) -> map.get(b) - map.get(a)
        );

        priorityQueue.addAll(map.keySet());

        while (!priorityQueue.isEmpty()) {

            char ch = priorityQueue.poll();
            int freq = map.get(ch);

            while (freq-- > 0) {
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();


    }
}