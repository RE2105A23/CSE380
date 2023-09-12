import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter the number of subjects you have learned:");
        int numberOfSubjects = scanner.nextInt();

        if (numberOfSubjects <= 0) {
            System.out.println("Invalid");
            return; // Exit the program
        }

        int totalMarks = 0;
        for (int i = 1; i <= numberOfSubjects; i++) {
            //System.out.println("Enter the marks for subject " + i + ":");
            int marks = scanner.nextInt();
            
            if (marks >= 0 && marks <= 100) { // Check if marks are within valid range
                totalMarks += marks;
            }
        }

        System.out.println(totalMarks);
    }
}