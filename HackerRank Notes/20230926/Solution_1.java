import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read employee details
        int empId = Integer.parseInt(sc.nextLine());
        String empName = sc.nextLine();
        String empDesignation = sc.nextLine();
        
        // Check for appraisal eligibility
        if (empId > 201) {
            int updatedSalary = 20000 + 1000;
            System.out.println("Name: " + empName);
            System.out.println("Employee ID: " + empId);
            System.out.println("Updated Salary: " + updatedSalary + " INR");
        } else {
            System.out.println("No Appraisal");
        }
        
        sc.close();
    }
}