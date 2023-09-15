import java.io.*;
import java.util.*;

enum Day {
    MONDAY("Monday", "8:30", "5:30"),
    TUESDAY("Tuesday", "8:30", "5:30"),
    WEDNESDAY("Wednesday", "8:30", "5:30"),
    THURSDAY("Thursday", "8:30", "5:30"),
    FRIDAY("Friday", "8:30", "5:30"),
    SATURDAY("Saturday", "9:30", "4:30");

    private final String dayName;
    private final String openTime;
    private final String closeTime;

    Day(String dayName, String openTime, String closeTime) {
        this.dayName = dayName;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public String getOpenTime() {
        return openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner scanner = new Scanner(System.in);
        String inputDay = scanner.nextLine().toUpperCase();

        switch (inputDay) {
            case "MONDAY":
                printTimings(Day.MONDAY);
                break;
            case "TUESDAY":
                printTimings(Day.TUESDAY);
                break;
            case "WEDNESDAY":
                printTimings(Day.WEDNESDAY);
                break;
            case "THURSDAY":
                printTimings(Day.THURSDAY);
                break;
            case "FRIDAY":
                printTimings(Day.FRIDAY);
                break;
            case "SATURDAY":
                printTimings(Day.SATURDAY);
                break;
            default:
                System.out.println("Library is closed");
                break;
        }
    }

    public static void printTimings(Day day) {
        System.out.println(day.getOpenTime() + " " + day.getCloseTime());
        
    }
}