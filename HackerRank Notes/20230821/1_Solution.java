//
// Created by SRI VISHNU JSB on 8/21/2023.
//
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);

        int n1=scan.nextInt();
        int n2=scan.nextInt();

        if(n1>0 && n2>0) {
            System.out.print(n1+"-"+n2);
        }
        else {
            System.out.print("Invalid Input");
        }

        scan.close();
    }
}