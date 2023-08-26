//
// Created by SRI VISHNU JSB on 8/24/2023.
//
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
          Scanner scan = new Scanner(System.in);

        long accountNumber;
        String accountHolderName;
        char gender;
        int currentBalance = 20000;

        //System.out.println("Enter Account Number:");
        accountNumber = scan.nextLong();

        scan.nextLine(); // Consume the newline

        //System.out.println("Enter Account Holder Name:");
        accountHolderName = scan.nextLine();

        //System.out.println("Enter Gender (M/F):");
        gender = scan.next().charAt(0);

        //System.out.println("Enter Amount to be Withdrawn:");
        int withdrawalAmount = scan.nextInt();

        if (withdrawalAmount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            if (withdrawalAmount <= currentBalance) {
                currentBalance -= withdrawalAmount;
                System.out.println("Hi " + (gender == 'M' ? "Mr." : "Ms.") + " " + accountHolderName + "!");
                System.out.println("Your Account Balance after withdrawl is " + currentBalance + ".");
            } else {
                System.out.println("Hi " + (gender == 'M' ? "Mr." : "Ms.") + " " + accountHolderName + "!");
                System.out.println("Insufficient Funds! You can not withdraw " + withdrawalAmount + ".");
            }
        }

        scan.close();
    }
}