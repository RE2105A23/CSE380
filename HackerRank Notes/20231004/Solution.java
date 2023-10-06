public class TreePlantation {
    
    public static void sortTrees(int[] heights) {
        int n = heights.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (heights[j] > heights[j + 1]) {
                    // Swap heights[j] and heights[j + 1]
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] treeHeights = {71, 71, 70, 69, 68, 65, 78, 88, 61, 63};

        // Sort the trees
        sortTrees(treeHeights);

        // Print the sorted heights
        for (int height : treeHeights) {
            System.out.print(height + " ");
        }
    }
}
