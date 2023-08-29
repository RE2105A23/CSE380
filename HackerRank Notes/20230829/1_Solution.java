//
// Created by SRI VISHNU JSB on 2023/08/28.
//

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        if (num >= 0) {
            System.out.println((double) num);
        } else {
            System.out.println("Invalid Input");
        }
    }
}