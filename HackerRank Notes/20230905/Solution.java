import java.io.*;
import java.util.*;

class WordChecker {
    private String word1;
    private String word2;

    WordChecker(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    private int[] countChars(String word) {
        int[] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            count[ch - 'a']++;
        }
        return count;
    }

    public boolean areSimilar() {
        int[] count1 = countChars(word1);
        int[] count2 = countChars(word2);

        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String word1 = getInputPart(input, 0);
        String word2 = getInputPart(input, 1);

        WordChecker checker = new WordChecker(word1, word2);
        if (checker.areSimilar()) {
            System.out.println("Similar");
        } else {
            System.out.println("Not Similar");
        }
    }

    public static String getInputPart(String input, int index) {
        int spaceIndex = findSpaceIndex(input);
        if (index == 0) {
            return input.substring(0, spaceIndex);
        } else {
            return input.substring(spaceIndex + 1);
        }
    }

    public static int findSpaceIndex(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                return i;
            }
        }
        return -1;
    
    }
}