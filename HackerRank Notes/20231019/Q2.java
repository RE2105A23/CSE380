/*
Mehar's teacher taught her ascending and descending order. In order to test the clarity of the same concept she gave her an array of elements that contained N numbers. Help Mehar by developing the program for the same. The program ask for two choices, i.e to print ascending order or descending order. The program should print ascending order on entering 1 and descending order on entering 2. If duplicate elements exist in an array then it should only print once in the output.

Input Format

Number of elements in an array,N

Elements of an array

Enter one choice out of two(1 or 2)

Constraints

N should not be less than 5 and greater than 15.

Output Format

Sorted array depending on the choice

Sample Input 0

7
12 3 4 5 7 8 3
1
Sample Output 0

3 4 5 7 8 12
Sample Input 1

4
Sample Output 1

Invalid
 */

import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // Check if N is within the given constraints
        if (N < 5 || N > 15) {
            System.out.println("Invalid");
            return;
        }

        // Read N elements into a TreeSet (automatically removes duplicates and sorts in ascending order)
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            treeSet.add(num);
        }

        // Copy the elements from the TreeSet to an ArrayList
        ArrayList<Integer> arr = new ArrayList<>(treeSet);

        int choice = scanner.nextInt();

        // Sort the array based on the choice
        if (choice == 1) {
            // Already sorted in ascending order
        } else if (choice == 2) {
            Collections.reverse(arr);
        } else {
            System.out.println("Invalid choice");
            return;
        }

        // Print the sorted array
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i < arr.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
