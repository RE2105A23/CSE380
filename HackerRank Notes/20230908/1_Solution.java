import java.util.Scanner;

public class BankTransaction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read present balance
        float balance = scanner.nextFloat();
        int choice = scanner.nextInt();
        
        switch(choice) {
            case 1: // Withdrawal
                float withdrawalAmount = scanner.nextFloat();
                if(withdrawalAmount > balance) {
                    System.out.println("Error");
                } else {
                    balance -= withdrawalAmount;
                    System.out.printf("%.2f", balance);
                }
                break;
                
            case 2: // Deposit
                float depositAmount = scanner.nextFloat();
                balance += depositAmount;
                System.out.printf("%.2f", balance);
                break;
                
            case 3: // Check balance
                System.out.printf("%.2f", balance);
                break;
                
            default:
                System.out.println("Error");
                break;
        }
    }
}
