//
// Created by SRI VISHNU JSB on 2023/08/28.
//

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        // Reading number of items ordered by Neha
        int n = scanner.nextInt();

        // Reading number of items ordered by Nisha
        int x = scanner.nextInt();
        
        // Calculating and printing the total number of items
        System.out.println(n + x);
    }
}