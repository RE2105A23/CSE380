/*
Puneet and Virat are playing a game. Virat tells a number that Puneet need to check whether that number is even and multiple of 13 or not. Write a program in which implement a method public boolean check(int n) which will return true if number satisfy the conditions else return false.

Input Format

One integer value representing number given by Virat.

Constraints

Number will lie between 10 and 500.

Output Format

True/False according to the value returned by the method or will print Invalid Input in case of number did not match the constraints.

Sample Input 0

13
Sample Output 0

False
Sample Input 1

130
Sample Output 1

True
*/

import java.util.Scanner;

public class Main {

    // Method to check if the number is even and a multiple of 13
    public static boolean check(int n) {
        return n % 2 == 0 && n % 13 == 0;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the number from the user
        int number = scanner.nextInt();

        // Check if the number lies between 10 and 500
        if (number < 10 || number > 500) {
            System.out.println("Invalid Input");
            return;
        }

        // Close the scanner
        scanner.close();

        // Call the check method and store the result
        boolean result = check(number);

        // Print the result in a case-sensitive manner
        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
