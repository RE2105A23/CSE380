/*
Write a program to take the input of String and display all the characters present in the input string in sorted order with their count. If the length of the string will be less than equal to 5, display the message “Invalid Input”.

Input Format

Your program should take the input of one string.

Constraints

Length of strings should be greater than 5.

Output Format

Your program should display the characters present in the string in sorted order with their count.

Sample Input 0

hurrey
Sample Output 0

e1h1r2u1y1
*/

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.length() <= 5) {
            System.out.println("Invalid Input");
            return;
        }

        Map<Character, Integer> charCountMap = new TreeMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder output = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            output.append(entry.getKey()).append(entry.getValue());
        }

        System.out.println(output.toString());
    }
}
