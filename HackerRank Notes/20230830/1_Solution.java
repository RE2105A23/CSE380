import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int choice = scanner.nextInt();
        double temperature = scanner.nextDouble();
        double convertedTemperature;
        
        switch(choice) {
            case 1:  // Fahrenheit to Celsius
                convertedTemperature = (temperature - 32) * 5.0/9.0;
                System.out.printf("%.2f", convertedTemperature);
                break;
            case 2:  // Celsius to Fahrenheit
                convertedTemperature = (temperature * 9.0/5.0) + 32;
                System.out.printf("%.1f", convertedTemperature);
                break;
            default:
                System.out.println("INVALID CHOICE");
                break;
        }
    }
}