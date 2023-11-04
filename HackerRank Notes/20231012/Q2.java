/*
 Mr. Ultalal is very intelligent person and He has a habit to read every word in reverse order. One day he went to book store the buy a book But in book all the paragraphs / sentences were written in regular word. So help Mr. Ultalal to read a book using java code in reverse order. The code accepts a string and display the new string after reversing each character of the word in lower case. If the string contains number or string is null then display the massage “Invalid input”

Input Format

Enter the String :Lovely Professional University ylevol lanoisseforp ytisrevinu First line read the input as String

Constraints

numbers of word in string > 1 numbers of word in string > 1

Output Format

Display the string in reverse order in lowercase

Sample Input 0

Lovely Professional University
Sample Output 0

ylevol lanoisseforp ytisrevinu
 */

import java.util.Scanner;

public class Solution {

    public static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder(word.toLowerCase());
        return sb.reverse().toString();
    }

    public static String reverseSentence(String sentence) {
        if (sentence == null || sentence.matches(".*\\d.*")) {
            return "Invalid input";
        }
        
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        
        for (String word : words) {
            reversedSentence.append(reverseWord(word)).append(" ");
        }
        
        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter the String: ");
        String sentence = scanner.nextLine();
        
        String result = reverseSentence(sentence);
        System.out.println(result);
    }
}
