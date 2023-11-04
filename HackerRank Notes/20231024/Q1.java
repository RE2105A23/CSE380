/*
Create a class Person having a single attribute: age. Now, create a functional interface with the following method in it: void find(Person p[]); Create a Demo class having main() method and ask the user to createa and initialize "n" Person objects (where "n" is input given by user). Now, use the lambda expression that will use this find() method to find out how many Persons have age greater than 25.

Input Format

Your program will take 2 types of inputs. First user input will be no. of person objects "n" to be created. Remaining user inputs will be "age" value of every Person object created. If value of "n" entered is less than 1, then display message "Invalid input" and no further input should be taken. Otherwise, display no. of persons having age greater than 25.

Constraints

Value of "n" and "age" should be greater than 0. If any invalid age (e.g. -2) is entered the user, then take 18 as the default age.

Output Format

Display no. of persons having age greater than 25. If value of "n" (i.e. no. of person objects) entered is less than 1, then display message "Invalid input".

Sample Input 0

3
26
14
30
Sample Output 0

2
*/

import java.util.Scanner;

// Create a functional interface
@FunctionalInterface
interface Finder {
    void find(Person[] p);
}

// Create a Person class with an age attribute
class Person {
    int age;

    Person(int age) {
        this.age = age;
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // Check the validity of 'n'
        if (n < 1) {
            System.out.println("Invalid input");
            return;
        }

        Person[] persons = new Person[n];

        // Initialize the Person objects
        for (int i = 0; i < n; i++) {
            //System.out.print("Enter the age of person " + (i + 1) + ": ");
            int age = sc.nextInt();
            if (age < 1) {
                age = 18;  // Set default age if invalid input
            }
            persons[i] = new Person(age);
        }

        // Create a lambda expression to find persons with age greater than 25
        Finder finder = (Person[] p) -> {
            int count = 0;
            for (Person person : p) {
                if (person.age > 25) {
                    count++;
                }
            }
            System.out.println(count);
        };

        // Use the lambda expression
        finder.find(persons);
    }
}
