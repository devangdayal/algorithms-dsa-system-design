import java.util.Arrays;

public class UnionTwoSortedArray {

    // Union of 2 sorted arrays (remove duplicates)
    public int[] mergeSortedArray(int[] num1, int[] num2) {

        int n = num1.length;
        int m = num2.length;

        int[] result = new int[n + m];
        int x = 0, y = 0, i = 0;
        while (x < n && y < m) {
            if (num1[x] < num2[y]) {
                if (i == 0 || result[i - 1] != num1[x]) {
                    result[i++] = num1[x];
                }
                x++;
            } else if (num1[x] > num2[y]) {
                if (i == 0 || result[i - 1] != num2[y]) {
                    result[i++] = num2[y];
                }
                y++;

            } else {
                if (i == 0 || result[i - 1] != num1[x]) {
                    result[i++] = num1[x];
                }
                x++;
                y++;
            }
        }

        while (x < n) {
            if (i == 0 || result[i - 1] != num1[x]) {
                result[i++] = num1[x];
            }
            x++;
        }

        while (y < m) {
            if (i == 0 || result[i - 1] != num2[y]) {
                result[i++] = num2[y];
            }
            y++;
        }

        return Arrays.copyOf(result, i);
    }

    // LeetCode merge sorted array (in-place)
    public void mergeSortedArray(int[] nums1, int n1, int[] nums2, int n2) {

        int i = n1 - 1;
        int j = n2 - 1;
        int k = n1 + n2 - 1;

        while (j >= 0) {

            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {

        // Union example
        int[] num1 = {1, 2, 3};
        int[] num2 = {2, 3, 8, 9, 20};

        UnionTwoSortedArray obj = new UnionTwoSortedArray();

        int[] resultArray = obj.mergeSortedArray(num1, num2);

        System.out.println(Arrays.toString(resultArray));

        // In-place merge example
        int[] nums1 = {1, 2, 3, 0, 0, 0, 0, 0};
        int n1 = 3;

        int[] nums2 = {2, 3, 8, 9, 20};
        int n2 = 5;

        obj.mergeSortedArray(nums1, n1, nums2, n2);

        System.out.println(Arrays.toString(nums1));
    }
}