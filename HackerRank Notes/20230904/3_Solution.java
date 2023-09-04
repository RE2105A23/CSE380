import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner scanner = new Scanner(System.in);

        // Read the borrowed amount from the user
        double borrowedAmount = scanner.nextDouble();
        final double INTEREST_RATE = 0.10;

        // Calculate the total amount Rahul has to pay back
        double totalAmount = borrowedAmount + (borrowedAmount * INTEREST_RATE);

        // Calculate the monthly EMI
        double emi = totalAmount / 12;

        // Print the total amount and EMI
        System.out.printf("%.0f%n", totalAmount);
        System.out.printf("%.2f%n", emi);  
    
    }
}