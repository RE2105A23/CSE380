/*
You need to create an application for a company, who is planning to maintain passwords of his employees, so to manage passwords company officials are thinking about of python case format. In Python case format, particular String is concerted into complete lower case and space is replaced by special character “$”. In this format , password which is taken as string that must consist with more than 1 word.

Input Format

In first line , you need to enter Password

Constraints

make password is of string type only

Output Format

convert entered password into python case format which is mentioned in question statement

Sample Input 0

Hello World
Sample Output 0

hello$world
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the password from the user
        //System.out.println("Enter the password:");
        String password = scanner.nextLine();

        // Check if the password contains more than one word
        if (!password.contains(" ")) {
            System.out.println("The password must consist of more than one word.");
            return;
        }

        // Convert to lower case
        password = password.toLowerCase();

        // Replace spaces with '$'
        password = password.replace(" ", "$");

        // Display the converted password
        //System.out.println("Converted password in Python case format: " + password);
        System.out.println(password);
    }
}
