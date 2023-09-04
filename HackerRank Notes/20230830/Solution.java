import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int classesHeld = scanner.nextInt();
        int classesAttended = scanner.nextInt();
        
        if (classesHeld < 0 || classesAttended < 0 || classesHeld < classesAttended) {
            System.out.println("Invalid Input");
            return;
        }

        double attendancePercentage = (double) classesAttended / classesHeld * 100;
        System.out.printf("%.0f%n", attendancePercentage);  // Display percentage without decimal places

        if (attendancePercentage >= 75) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}