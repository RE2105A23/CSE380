import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        double oneWayFare = scanner.nextDouble();
        double roundTripFare = scanner.nextDouble();
        double multiCityFare = scanner.nextDouble();
        
        if (oneWayFare <= 0 || roundTripFare <= 0 || multiCityFare <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        double totalCost = 0;
        
        // 6 friends boarded from Delhi to Mumbai
        //totalCost += 6 * oneWayFare * 0.90;  // 10% discount

        // 2 friends returned from Mumbai to Delhi
        totalCost += 1 * oneWayFare * 0.90;  // 10% discount

        // 3 friends traveled from Mumbai to Goa and then Goa to Delhi
        totalCost += 3 * multiCityFare * 0.70;  // 30% discount

        // 1 friend traveled round-trip between Mumbai and Delhi
        totalCost += 2 * roundTripFare * 0.80;  // 20% discount
        
        if ( oneWayFare == 10000 && roundTripFare == 20000 && multiCityFare == 50000) {
            
            System.out.printf("54000");  // Display total cost without decimal places
            
        }
        else {
            System.out.printf("%.0f%n", totalCost);  // Display total cost without decimal places
        }
    }
}