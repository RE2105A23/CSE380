/*
Create a method named ‘factorial’ in your program that will display the factorial of any given number. factorial of an integer is the product of numbers ranging from 1 to N

Input Format

A single interger that represents the number whose factorial you need to find

Constraints

1<=N<=10

Output Format

Displays the output of number N

Sample Input 0

2
Sample Output 0

2
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the number from the user
        int number = scanner.nextInt();

        // Validate the input constraints
        if (number < 1 || number > 10) {
            System.out.println("Number should be between 1 and 10.");
            return;
        }

        // Call the factorial method and display the result
        System.out.println(factorial(number));
    }

    // Method to calculate the factorial of a number
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
