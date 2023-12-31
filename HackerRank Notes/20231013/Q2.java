/*
Aviraj and Viraj are playing a game. Viraj shared a statement with Aviraj. Viraj wants Avraj to tell word count having length N. Help Viraj by developing a program.

Input Format

First line will contain a statement. Second line will contain value of N.

Constraints

N should not be greater than 10 or less than 1 else "Invalid Input"

Output Format

One integer value representing count of words with length N.

Sample Input 0

Nevertheless I will be there
12
Sample Output 0

Invalid Input
Sample Input 1

I like Java
4
Sample Output 1

2
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String statement = sc.nextLine();
        int N = sc.nextInt();

        if (N > 10 || N < 1) {
            System.out.println("Invalid Input");
            return;
        }

        String[] words = statement.split(" ");
        int count = 0;

        for (String word : words) {
            if (word.length() == N) {
                count++;
            }
        }

        System.out.println(count);
    }
}