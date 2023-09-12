import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        while (N-- > 0) {
            int sum = 0;
            for (int i = 0; i < 7; i++) {
                sum += sc.nextInt();
            }
            if (sum == 56) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
        sc.close();
    
    }
}