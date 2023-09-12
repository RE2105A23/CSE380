import java.io.*;
import java.util.*;

// Enum definition for Subjects
enum Subjects {
    Java(4, "Shruti"),
    OS(3, "Puneet Kumar"),
    AI(2, "James William"),
    Android(3, "Md. Adil Khan");

    private final int credits;
    private final String faculty;

    Subjects(int credits, String faculty) {
        this.credits = credits;
        this.faculty = faculty;
    }

    public int getCredits() {
        return credits;
    }

    public String getFaculty() {
        return faculty;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);
        String subjectName = scanner.nextLine();
        
        switch(subjectName) {
            case "Java":
                printDetails(Subjects.Java);
                break;
            case "OS":
                printDetails(Subjects.OS);
                break;
            case "AI":
                printDetails(Subjects.AI);
                break;
            case "Android":
                printDetails(Subjects.Android);
                break;
            default:
                System.out.println("This subject is not running in this semester.");
                break;
        }
    }

    private static void printDetails(Subjects subject) {
        System.out.println(subject.getFaculty() + " " + subject.getCredits());
    }
}