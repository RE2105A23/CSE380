/*
Write a program to take "n" String inputs from user and store them in array (where "n" is no. of String objects specified by user at run-time). Sort the array in ascending order and display the array. If "n" entered by user is less than 2, then display message "Invalid".

Input Format

Your program should take the input of "n" string objects.

Constraints

No. of string objects entered by the user should be greater than 1.

Output Format

Your program should display the array of strings in sorted ascending order.

Sample Input 0

4
India
America
Australia
France
Sample Output 0

America
Australia
France
India
*/

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        if (n < 2) {
            System.out.println("Invalid");
            return;
        }

        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            strArray[i] = scanner.nextLine();
        }

        // Sort the array in ascending order
        Arrays.sort(strArray);

        // Display the sorted array
        for (String str : strArray) {
            System.out.println(str);
        }
    }
}
