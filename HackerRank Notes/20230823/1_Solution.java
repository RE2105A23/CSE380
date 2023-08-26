//
// Created by SRI VISHNU JSB on 8/23/2023.
//
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scanner = new Scanner(System.in);

        long accountNumber = scanner.nextLong();
        scanner.nextLine(); // Clear the newline left in the buffer
        String accountHolderName = scanner.nextLine();
        char gender = scanner.next().charAt(0);
        int amountToWithdraw = scanner.nextInt();

        int currentAccountBalance = 20000;

        if (amountToWithdraw <= currentAccountBalance) {
            currentAccountBalance -= amountToWithdraw;
            System.out.print("Hi " + getTitle(gender) + accountHolderName + "!\n");
            System.out.println("Your Account Balance after withdrawl is " + currentAccountBalance + ".");
        } else {
            System.out.print("Hi " + getTitle(gender) + accountHolderName + "!\n");
            System.out.println("Insufficient Funds! You can not withdraw " + amountToWithdraw + ".");
        }
    }

    public static String getTitle(char gender) {
        return gender == 'M' ? "Mr. " : "Ms. ";
    }
}