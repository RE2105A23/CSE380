/*
In which one method getInfo must be present to accept id and name of the person. Then using object print the same.

Input Format

1 john

Constraints

id must be integer name must be String

Output Format

1 john

Sample Input 0

2 Robin
Sample Output 0

2 Robin
*/

// Import the Scanner class for reading user input
import java.util.Scanner;

// Define a class named Person
class Person {
    // Instance variables to store id and name
    private int id;
    private String name;

    // Method to get the id and name from user
    public void getInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to print the stored id and name
    public void printInfo() {
        System.out.println(id + " " + name);
    }
}

// Main class to run the application
public class Main {
    public static void main(String[] args) {
        // Initialize the Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read the id (integer) and name (String) from user input
        int id = scanner.nextInt();
        String name = scanner.next();

        // Create a Person object and use getInfo to store id and name
        Person person = new Person();
        person.getInfo(id, name);

        // Print the stored id and name using printInfo method
        person.printInfo();
    }
}
