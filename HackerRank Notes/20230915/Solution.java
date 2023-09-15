import java.util.Scanner;

public class CompareProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] jasmineProducts = new String[4];
        String[] jackProducts = new String[4];
        
        // Input products for Jasmine
        for (int i = 0; i < 4; i++) {
            jasmineProducts[i] = scanner.next();
        }

        // Input products for Jack
        for (int i = 0; i < 4; i++) {
            jackProducts[i] = scanner.next();
        }

        int similarCount = 0;

        // Compare products
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (jasmineProducts[i].equals(jackProducts[j])) {
                    similarCount++;
                    break; // Break to avoid counting duplicates
                }
            }
        }

        System.out.println(similarCount);
    }
}
