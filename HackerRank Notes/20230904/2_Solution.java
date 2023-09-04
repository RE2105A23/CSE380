import java.io.*;
import java.util.*;

public class Solution {

    private String statement;
    private char searchChar;

    public CharacterCounter(String statement, char searchChar) {
        this.statement = statement;
        this.searchChar = searchChar;
    }

    public int countOccurrences() {
        int count = 0;
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == searchChar) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the string from the user
        String statement = scanner.nextLine();
        
        // Read the character from the user
        char searchChar = scanner.next().charAt(0);

        // Create an instance of the CharacterCounter class
        CharacterCounter counter = new CharacterCounter(statement, searchChar);

        // Print the count of the character occurrences
        System.out.println(counter.countOccurrences());
    
    }
}