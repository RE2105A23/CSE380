//
// Created by SRI VISHNU JSB on 2023/08/26.
//

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);

        //System.out.println("Enter the 8-bit binary paper code:");
        String binaryCode = scan.nextLine();

        if (binaryCode.length() == 7 && binaryCode.matches("[01]+")) {
            int decimalValue = Integer.parseInt(binaryCode, 2);
            if (decimalValue >= 'A' && decimalValue <= 'Z') {
                char paperCode = (char) decimalValue;
                System.out.println(paperCode);
            } else {
                System.out.println("INVALID PAPER CODE");
            }
        } else {
            System.out.println("INVALID PAPER CODE");
        }

        scan.close();
    }

}