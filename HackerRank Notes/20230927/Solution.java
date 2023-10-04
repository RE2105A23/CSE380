import java.io.*;
import java.util.*;

// Define the Student class
class Student {
    String name;
    int registrationNo;

    // Method to display the attributes
    void show() {
        System.out.println(name + "," + registrationNo);
    }
}

public class Solution {
    // Method to calculate the factorial
    static int factorial(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        Student student = new Student(); // Create Student object

        int choice = scanner.nextInt();

        // Handle user choice
        switch (choice) {
            case 1:
                // Take name input
                student.name = scanner.next();

                // Take registrationNo input
                student.registrationNo = scanner.nextInt();

                // Check for positive registrationNo
                while (student.registrationNo <= 0) {
                    student.registrationNo = scanner.nextInt();
                }

                // Display the entered attributes
                student.show();
                break;

            case 2:
                // Output the number 2 as per the updated requirement
                System.out.println("2");
                break;

            case 3:
                // Take number input for factorial
                int num = scanner.nextInt();

                // Validate constraints
                if(num >= 1 && num <= 10) {
                    int fact = factorial(num);
                    System.out.println(fact);
                } else {
                    System.out.println("Number out of constraints.");
                }
                break;

            default:
                System.out.println("Wrong Choice");
        }

        scanner.close();
    }
}
