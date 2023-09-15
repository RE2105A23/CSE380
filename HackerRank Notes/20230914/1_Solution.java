import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        // Accept the number of elements
        int n = scanner.nextInt();
        
        // Initialize the array
        int[] arr = new int[n];
        
        // Accept the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Calculate the sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        // Display the sum
        System.out.println(sum);
          
    }
}