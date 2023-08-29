//
// Created by SRI VISHNU JSB on 2023/08/28.
//

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        String binaryStr = scanner.nextLine();
        System.out.println(binaryToChar(binaryStr));
    }

    private static String binaryToChar(String binaryStr) {
        // Check if the length of the binary string is 8
        if (binaryStr.length() != 7) {
            return "INVALID PAPER CODE";
        }
        
        // Check if each character in the binary string is either '0' or '1'
        for (char c : binaryStr.toCharArray()) {
            if (c != '0' && c != '1') {
                return "INVALID PAPER CODE";
            }
        }
        
        // Convert the binary string to its decimal representation
        int decimalValue = Integer.parseInt(binaryStr, 2);
        
        // If the decimal number falls between 65 and 90 (both inclusive)
        if (decimalValue >= 65 && decimalValue <= 90) {
            return Character.toString((char) decimalValue);
        } else {
            return "INVALID PAPER CODE";
        }
    }

}