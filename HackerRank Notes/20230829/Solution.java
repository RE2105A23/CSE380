//
// Created by SRI VISHNU JSB on 2023/08/28.
//

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        double rating = scanner.nextDouble();
        
        if (rating >= 1.0 && rating <= 5.0) {
            System.out.println("Thanks");
        } else {
            System.out.println("Error: 101");
        }
    }
}