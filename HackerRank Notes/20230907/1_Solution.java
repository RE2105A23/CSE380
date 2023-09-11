import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
         Scanner sc = new Scanner(System.in);
        
        // Accepting the number of rows as input
        int rows = sc.nextInt();

        // Check if rows entered is less than or equal to 0
        if (rows <= 0) {
            System.out.println("Invalid Rows");
        } else {
            // Loop to print the pattern
            for (int i = rows; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}