import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner sc = new Scanner(System.in);
        
        // Accepting the principal amount
        double principal = sc.nextDouble();

        // Calculate total amount with 10% interest
        double totalAmount = principal + (0.10 * principal);
        
        // Calculate EMI (totalAmount divided by 12 months)
        double emi = totalAmount / 12;

        System.out.println(String.format("%.0f", totalAmount));  // Displaying the total amount
        System.out.println(String.format("%.2f", emi));          // Displaying the EMI rounded to 2 decimal places
    
    }
}}