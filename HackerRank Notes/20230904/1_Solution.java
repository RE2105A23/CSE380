import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);

        // Read the string from the user
        String statement = scanner.nextLine();
        
        // Read the character from the user
        char searchChar = scanner.next().charAt(0);

        // Find the count of the character in the string
        int count = 0;
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == searchChar) {
                count++;
            }
        }

        System.out.println(count);
    
    }
}