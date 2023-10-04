import java.io.*;
import java.util.*;

public class Solution {
    
    
    // Define the isBigger method that takes two integers a and b
    public static boolean isBigger(int a, int b) {
        // Return true if a is greater than b, otherwise return false
        return a > b;
    }

    // Entry point of the program: the main method
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Create a new Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the two integers separated by space
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Close the scanner as it's no longer needed
        scanner.close();

        // Check if the numbers lie between 10 and 1000
        if (a >= 10 && a <= 1000 && b >= 10 && b <= 1000) {
            // Call the isBigger method and print the result
            System.out.println(isBigger(a, b));
        } else {
            // Print "Invalid Input" if the numbers are out of the given constraints
            System.out.println("Invalid Input");
        }
    }
}