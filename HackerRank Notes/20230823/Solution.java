//
// Created by SRI VISHNU JSB on 8/23/2023.
//
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
        
        int cubeRoot = (int) Math.cbrt(N);
        int cube = cubeRoot * cubeRoot * cubeRoot;
        
        if (cube == N) {
            System.out.println("Perfect Cube");
        } else {
            System.out.println("Not Perfect Cube");
        }
	}
}