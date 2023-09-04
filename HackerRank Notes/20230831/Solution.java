import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two digit number: ");
        int number = scanner.nextInt();

        // Check if it's a two-digit number
        if (number < 10 || number > 99) {
            System.out.println("Invalid Input");
            return;
        }
        // Extract digits

        int firstDigit = number / 10;
        int secondDigit = number % 10;

        // Calculate sum and product of digits
        int sum = firstDigit + secondDigit;
        int product = firstDigit * secondDigit;

        if (number == sum + product) {
            System.out.println("Special two digit number");
        } else {
            System.out.println("Not a special two digit number");
        }    
    }
}