import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner scan = new Scanner(System.in);
        
        // Read array size
        int n = scan.nextInt();
        if (n <= 0) {
            System.out.println("Invalid Array Size");
            return;
        }

        // Read array elements
        double[] doubleArray = new double[n];
        for (int i = 0; i < n; i++) {
            doubleArray[i] = scan.nextDouble();
        }

        // Convert double array to int array and validate elements
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            if (doubleArray[i] < 0) {
                System.out.println("Invalid Array Elements");
                return;
            }
            intArray[i] = (int) doubleArray[i];
        }

        // Print int array
        for (int i = 0; i < n; i++) {
            System.out.println(intArray[i]);
        }
    
    }
}