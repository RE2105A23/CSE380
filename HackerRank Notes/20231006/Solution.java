import java.util.Scanner;

class Employee {
    int id;
    int age;

    // Parameterized constructor
    public Employee(int id, int age) {
        this.id = id;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of Employee objects: ");
        int n = sc.nextInt();

        // Validate number of Employee objects
        if (n < 1 || n > 10) {
            System.out.println("Invalid input");
            return;
        }

        Employee[] employees = new Employee[n];
        int minAge = Integer.MAX_VALUE;
        Employee minAgeEmployee = null;

        for (int i = 0; i < n; i++) {
            // System.out.println("Enter id and age for Employee " + (i + 1) + ": ");
            int id = sc.nextInt();
            int age = sc.nextInt();

            // Validate id and age
            if (id < 10 || id > 1000 || age < 18 || age > 50) {
                System.out.println("Invalid data");
                return;
            }

            employees[i] = new Employee(id, age);

            if (age < 30 && age < minAge) {
                minAge = age;
                minAgeEmployee = employees[i];
            }
        }

        // Display the employee with the smallest age less than 30
        if (minAgeEmployee != null) {
            System.out.println(minAgeEmployee.id + " " + minAgeEmployee.age);
        }

        sc.close();
    }
}
