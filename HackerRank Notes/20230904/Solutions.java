import java.io.*;
import java.util.*;

public class Solution {

    private double borrowedAmount;
    private static final double INTEREST_RATE = 0.10;

    public LoanEMI(double borrowedAmount) {
        this.borrowedAmount = borrowedAmount;
    }

    public double calculateTotalAmount() {
        return borrowedAmount + (borrowedAmount * INTEREST_RATE);
    }

    public double calculateEMI() {
        return calculateTotalAmount() / 12;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the borrowed amount from the user
        double borrowedAmount = scanner.nextDouble();

        // Create an instance of the LoanEMI class
        LoanEMI emiCalculator = new LoanEMI(borrowedAmount);

        // Print the total amount and EMI
        System.out.printf("%.2f%n", emiCalculator.calculateTotalAmount());
        System.out.printf("%.2f%n", emiCalculator.calculateEMI());
    
    }
}