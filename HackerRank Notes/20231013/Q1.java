/*
 Tara has been assigned a task by her friends to retrieve a character that appears most number of the times in a given sequence.If the frequency of two or more characters is same than return the first character that occurs in the string among them.

Input Format

A string literal

Constraints

The string will contain only characters, from the ranges ('a'-z',A-Z,0'-9'), else "Error"

Output Format

The character occuring maximum number of times

Sample Input 0

takeforward
Sample Output 0

Maximum occurring character is: a
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input == null || input.isEmpty() || !input.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("Error");
            return;
        }

        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char maxChar = input.charAt(0);
        int maxCount = frequencyMap.get(maxChar);

        for (char c : input.toCharArray()) {
            if (frequencyMap.get(c) > maxCount) {
                maxCount = frequencyMap.get(c);
                maxChar = c;
            }
        }

        System.out.println("Maximum occurring character is: " + maxChar);   
    }
}