import java.util.Scanner;

class Student {
    String name = null;
    int registrationNo = 0;

    public void show() {
        System.out.println(this.name + "," + this.registrationNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your choice: ");
        // System.out.println("1: Enter student details");
        // System.out.println("2: Display default student details");

        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                sc.nextLine();  // Consume the remaining newline
                // System.out.println("Enter student name: ");
                student.name = sc.nextLine();

                // System.out.println("Enter student registration number: ");
                student.registrationNo = sc.nextInt();

                // Check for a positive registration number
                while (student.registrationNo <= 0) {
                    // System.out.println("Please enter a positive registration number: ");
                    student.registrationNo = sc.nextInt();
                }

                student.show();
                break;

            case 2:
                student.show();
                break;

            default:
                System.out.println("Wrong Choice");
                break;
        }

        sc.close();
    }
}
