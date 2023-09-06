import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Invalid Input");
        } else {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("&");
                }
                System.out.println();
            }
        }
    
    }
}