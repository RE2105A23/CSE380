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

        //System.out.println("Enter the number of 4s hit by Smith:");
        int num4s = scan.nextInt();

        //System.out.println("Enter the number of 6s hit by Smith:");
        int num6s = scan.nextInt();

        // Ensure non-negative values
        if (num4s < 0) {
            num4s = 0;
        }
        if (num6s < 0) {
            num6s = 0;
        }

        // Calculate total score
        int totalScore = (num4s * 4) + (num6s * 6);

        System.out.println(totalScore);

        scan.close();

    }
}