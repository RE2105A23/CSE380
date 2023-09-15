import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] firstDeck = new int[n];
        int[] secondDeck = new int[n];
        
        for (int i = 0; i < n; i++) {
            firstDeck[i] = sc.nextInt();
            secondDeck[i] = firstDeck[i];
        }
        
        //System.out.println("First Deck:");
        for (int i = 0; i < n; i++) {
            System.out.print(firstDeck[i] + " ");
        }
        System.out.println();
        
        //System.out.println("Second Deck:");
        for (int i = 0; i < n; i++) {
            System.out.print(secondDeck[i] + " ");
        }
        System.out.println();
        
        sc.close();
    
    }
}