//
// Created by SRI VISHNU JSB on 8/22/2023.
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
        
        int n=scan.nextInt();

        if (n <= 1) {
            System.out.println("Not Prime Number");
        } else if (n <= 3) {
            System.out.println("Prime Number");
        } else if (n % 2 == 0 || n % 3 == 0) {
            System.out.println("Not Prime Number");
        } else {
            boolean isPrime = true;
            int i = 5;
            while (i * i <= n) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    isPrime = false;
                    break;
                }
                i += 6;
            }
            
            if (isPrime) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not Prime Number");
            }
        }
    }
} 

