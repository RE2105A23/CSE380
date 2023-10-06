import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        // Sample Input
        int[] arr1 = {3, 7, 8, 6, 5};
        int[] arr2 = {4, 3, 8, 6};
        int[] arr3 = {3, 7, 8, 5, 6};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();

        // Populate the first set
        for (int num : arr1) {
            set1.add(num);
        }

        // Populate the second set and find common elements with the first set
        for (int num : arr2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        // Find common elements with the third array
        for (int num : arr3) {
            if (set2.contains(num)) {
                commonSet.add(num);
            }
        }

        // Convert the set to an array and sort it
        Integer[] commonArr = commonSet.toArray(new Integer[0]);
        Arrays.sort(commonArr);

        // Print the common elements in ascending order
        for (int num : commonArr) {
            System.out.print(num + " ");
        }
    }
}
