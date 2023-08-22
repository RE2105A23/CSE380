//
// Created by SRI VISHNU JSB on 8/21/2023.
//
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (isValidNumber(num1) && isValidNumber(num2) && isValidNumber(num3)) {
            double mean = (num1 + num2 + num3) / 3.0;
            // System.out.printf("%.1f", mean);
            double roundedMean = Math.floor(mean * 10) / 10;
            System.out.println(roundedMean);
        } else {
            System.out.println("Invalid input");
        }

        scan.close();
    }

    private static boolean isValidNumber(int num) {
        return num > 1 && num < 1000;
    }
}