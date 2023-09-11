import java.util.Scanner;

class Account {

    int accno; 
    double amount = 0;
    String name;
    
    void insert(Scanner scan) {
        System.out.print("Enter Account Number: "); 
        accno = scan.nextInt();
        scan.nextLine();  // Consume the newline
        System.out.print("Enter Name: "); 
        name = scan.nextLine();
        System.out.print("Enter Initial Amount: ");
        amount = scan.nextDouble();
    }
    
    void deposit(Scanner scan) {
        System.out.print("Enter the amount to deposit: "); 
        double a = scan.nextDouble();
        amount += a;
    }
    
    void withdraw(Scanner scan) {
        System.out.print("Enter the Amount to withdraw: "); 
        double w = scan.nextDouble();
        
        if(w > amount) {
            System.out.println("Insufficient Balance!");
        } else {
            amount -= w;
        }
    }
    
    void display() {
        System.out.println("Account Number: " + accno);
        System.out.println("Name: " + name);
        System.out.println("Balance Amount: " + amount);    
    }
}

public class BankAccount1 {
    
    public static void main(String[] args) {
        
        Account obj = new Account();
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            System.out.println("\nOptions:");
            System.out.println("1. Insert Account Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Account Info");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: "); 
            
            int n = scan.nextInt();
            
            switch(n) {
                case 1:
                    obj.insert(scan);
                    break;
                case 2:
                    obj.deposit(scan);
                    break;
                case 3:
                    obj.withdraw(scan);
                    break;
                case 4:
                    obj.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scan.close();
                    System.exit(0);
                default:
                    System.out.println("Select a correct option.");
            }
        }      
    }
}
