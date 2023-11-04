/*
Kumar has been given a string and asked to determine whether it can be converted into a palindrome after removing at most one character

Input Format

str="abcbea"

Constraints

1<=Str.length<=10^3 Str consists of Lowercase English characters

Output Format

true

Sample Input 0

abceba
Sample Output 0

true
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return isPalindrome(str, start + 1, end) || isPalindrome(str, start, end - 1);
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); // Read input from STDIN
        System.out.println(checkPalindrome(str)); // Output should be true or false based on the input
    }
}
