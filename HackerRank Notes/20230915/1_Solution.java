import java.util.Scanner;

public class AverageCAMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number of subjects.");
            return;
        }

        double[][] caMarks = new double[n][];

        for (int i = 0; i < n; i++) {
            int numCAs = sc.nextInt();
            caMarks[i] = new double[numCAs];
            for (int j = 0; j < numCAs; j++) {
                caMarks[i][j] = sc.nextDouble();
                if (caMarks[i][j] < 0) {
                    System.out.println("Invalid marks.");
                    return;
                }
            }
        }

        int subjectNumber = sc.nextInt() - 1; // adjusting for 0-indexing
        if (subjectNumber < 0 || subjectNumber >= n) {
            System.out.println("Invalid subject number.");
            return;
        }

        double sum = 0;
        for (double mark : caMarks[subjectNumber]) {
            sum += mark;
        }
        double average = sum / caMarks[subjectNumber].length;
        System.out.println("Average in Subject-" + (subjectNumber + 1) + " is " + average);
    }
}
