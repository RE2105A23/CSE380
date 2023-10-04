import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Create a new Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of subjects
        //System.out.println("Enter the number of subjects: ");
        
        // Read the number of subjects from user input
        int subjectCount = scanner.nextInt();

        // Check if the number of subjects exceeds the limit of 7
        if (subjectCount > 7) {
            // If it does, print an error message and exit the program
            System.out.println("Number of subjects should not exceed 7");
            return;
        }

        // Initialize a variable to keep track of the total marks
        int totalMarks = 0;
        
        // Calculate the maximum possible marks
        int maxMarks = 100 * subjectCount;

        // Prompt the user to enter the marks for each subject
        //System.out.println("Enter the marks for each subject: ");
        
        // Loop through each subject to read marks
        for (int i = 0; i < subjectCount; i++) {
            // Read the marks for the current subject
            int marks = scanner.nextInt();
            
            // Add the marks to the total
            totalMarks += marks;
        }

        // Close the scanner as it's no longer needed
        scanner.close();

        // Calculate the percentage of marks
        double percentage = ((double) totalMarks / maxMarks) * 100;

        // Determine and display the grade based on the percentage
        if (percentage > 90) {
            // If percentage > 90, grade is A+
            System.out.println("A+");
        } else if (percentage >= 70 && percentage <= 89) {
            // If percentage is between 70 and 89, grade is A
            System.out.println("A");
        } else if (percentage >= 60 && percentage <= 69) {
            // If percentage is between 60 and 69, grade is B
            System.out.println("B");
        } else if (percentage >= 50 && percentage <= 59) {
            // If percentage is between 50 and 59, grade is C
            System.out.println("C");
        } else {
            // If percentage <= 40, grade is D
            System.out.println("D");
        }
    }
}