public class AcademicTasks {

    public static double[] average_marks(double[][] marks) {
        int n = marks.length;
        double[] averages = new double[n];

        for (int i = 0; i < n; i++) {
            double first = 0, second = 0;

            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] > first) {
                    second = first;
                    first = marks[i][j];
                } else if (marks[i][j] > second && marks[i][j] != first) {
                    second = marks[i][j];
                }
            }

            averages[i] = (first + second) / 2.0;
        }

        return averages;
    }

    public static void main(String[] args) {
        // Sample Input: 2 students and their 3 academic tasks
        double[][] marks = {
            {10.5, 2.5, 15},
            {5.25, 6.75, 11.25}
        };

        double[] averages = average_marks(marks);

        // Print the average marks of best 2 academic tasks for each student
        for (double avg : averages) {
            System.out.print(avg + " ");
        }
    }
}
