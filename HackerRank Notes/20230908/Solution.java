import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);

        // Read input number
        int N = scanner.nextInt();

        // Check for invalid input
        if(N < 0) {
            System.out.println("Invalid Input");
            return;
        }

        // Print numbers till N
        for(int i = 0; i <= N; i++) {
            System.out.println(i);
        }

        // Print "Games End"
        System.out.println("Games End");
    
    }
}