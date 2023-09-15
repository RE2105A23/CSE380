import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
         Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid Array Size");
            sc.close();
            return;
        }
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0) {
                System.out.println("Invalid Array Elements");
                sc.close();
                return;
            }
        }
        
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }
        
        if (secondMax == Integer.MIN_VALUE) {
            //System.out.println("No second largest element");
        } else {
            System.out.println(secondMax);
        }
        
        
        sc.close();
    }
}