// 1424. Diagonal Traverse II Solved Medium

// Given a 2D integer array nums,return all elements of nums in diagonal order as shown in the below images.

// Matrix can have empty rows or empty columns.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DiagonalTraversal {

    public int[] traverseBottomTop(List<List<Integer>> numbers) {

        int total = 0;
        int maxKey = 0;
        HashMap<Integer, List<Integer>> matMap = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.get(i).size(); j++) {
                int key = i + j;

                matMap.putIfAbsent(key, new ArrayList<>());
                matMap.get(key).add(numbers.get(i).get(j));
                total++;
                maxKey = Math.max(maxKey, key);
            }
        }

        int[] resultArray = new int[total];
        int index = 0;

        for (int key = 0; key <= maxKey; key++) {
            List<Integer> list = matMap.get(key);
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    resultArray[index++] = list.get(i);
                }
            }
        }

        return resultArray;
    }

    public int[] traverseTopBottom(List<List<Integer>> numbers) {

        int total = 0;
        int maxKey = 0;
        HashMap<Integer, List<Integer>> matMap = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.get(i).size(); j++) {
                int key = i + j;

                matMap.putIfAbsent(key, new ArrayList<>());
                matMap.get(key).add(numbers.get(i).get(j));
                total++;
                maxKey = Math.max(maxKey, key);
            }
        }

        int[] resultArray = new int[total];
        int index = 0;

        for (int key = 0; key <= maxKey; key++) {
            List<Integer> list = matMap.get(key);
            if (list != null) {
                for (int i = 0; i <= list.size() - 1; i++) {
                    resultArray[index++] = list.get(i);
                }
            }
        }

        return resultArray;
    }

    public static void main(String[] args) {
        DiagonalTraversal dt = new DiagonalTraversal();
        List<List<Integer>> numbers = new ArrayList<>();
        numbers.add(List.of(1, 2, 3));
        numbers.add(List.of(4, 5, 6));
        numbers.add(List.of(7, 8, 9));

        dt.printTraversal(numbers);

        numbers = new ArrayList<>(); 
        numbers.add(List.of(1, 2, 3, 4, 5));
        numbers.add(List.of(6, 7));
        numbers.add(List.of(8));
        numbers.add(List.of(9, 10, 11));
        numbers.add(List.of(12, 13, 14, 15, 16));


        System.out.println("\n\n");
        dt.printTraversal(numbers);

    }

    public void printTraversal(List<List<Integer>> numbers) {
        int[] resultBottomTop = traverseBottomTop(numbers);

        System.out.println("Bottom to Top Traversal:");
        for (int num : resultBottomTop) {
            System.out.print(num + " ");
        }

        int[] resultTopBottom = traverseTopBottom(numbers);
        System.out.println("\nTop to Bottom Traversal:");
        for (int num : resultTopBottom) {
            System.out.print(num + " ");
        }
        
    }
}
