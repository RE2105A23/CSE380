//
// Created by SRI VISHNU JSB on 2023/08/26.
//

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);

        //System.out.println("Enter number of items ordered by Neha:");
        int nehaItems = scan.nextInt();

        //System.out.println("Enter number of items ordered by Nisha:");
        int nishaItems = scan.nextInt();

        int totalItems = nehaItems + nishaItems;

        System.out.println(totalItems);

        scan.close();
    
    }
}