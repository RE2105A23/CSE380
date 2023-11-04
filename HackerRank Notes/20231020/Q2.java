/*
WAP to accpet one array of stings and integers.and count the number of stings and integers present in the array. Example Input: First line Accept size of array second line accept all elements like Array = {"Raj", "77", "101", "99", "Jio"}

Output: 3 2

Input Format

First line accept sixe of the array(n) second line accepts the n elements/values .

Constraints

the array is one string type array and n>0

Output Format

First line print the number of Integers present Second line prints the number of Strings present

Sample Input 0

5
Raj 77 101 99 Jio
Sample Output 0

3
2
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // Check for the constraint that n should be greater than 0
        if (n <= 0) {
            System.out.println("Invalid input. Array size should be greater than 0.");
            return;
        }
        
        scanner.nextLine();  // Consume the remaining newline character

        int countInt = 0, countString = 0;
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }

        for (String s : arr) {
            if (isInteger(s)) {
                countInt++;
            } else {
                countString++;
            }
        }

        System.out.println(countInt);
        System.out.println(countString);
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
