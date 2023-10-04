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

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        Student student = new Student(); // Create Student object

        // Display menu choices
        //System.out.println("Enter your choice: ");
        //System.out.println("1. Enter student details");
        //System.out.println("2. Display default student details");

        int choice = scanner.nextInt();

        // Handle user choice
        switch (choice) {
            case 1:
                // Take name input
                //System.out.println("Enter student name: ");
                student.name = scanner.next();

                // Take registrationNo input
                //System.out.println("Enter registration number: ");
                student.registrationNo = scanner.nextInt();

                // Check for positive registrationNo
                while (student.registrationNo <= 0) {
                    //System.out.println("Enter a positive registration number: ");
                    student.registrationNo = scanner.nextInt();
                }

                // Display the entered attributes
                student.show();
                break;

            case 2:
                // Display the default attributes
                student.show();
                break;

            default:
                System.out.println("Wrong Choice");
        }

        scanner.close();
    }
}