/*

Declare a class -> Account (accno, name, amount)
void insert() that is parameterized function taking values from main section
void deposit() -> add the value to amount based on the deposit_value
void withdraw() -> dedcut the withdrawn amount from the amount variable
void display() -> display accno, name and balance amount

In main section, declare switch case to accept the functions 
to deposit and withdraw and display the balance value of amount;

*/

import java.util.Scanner;

class Account {

	int accno; double amount=0;
	String name;
	
	void insert() {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter any Account Number, Name, Amount="); 
		//System.out.print("Account="); 
		//System.out.print("Name=");
		//System.out.print("Amount=");
		accno=scan.nextInt();
		name=scan.nextLine();name=scan.nextLine();
		amount=scan.nextDouble();
		
	}
	
	void deposit() {
		
		double a=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the amount to deposit="); a=scan.nextInt();
		
		amount=amount+a;
		
		
	}
	
	void withdraw() {
		
		double w=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Amount to withdraw="); w=scan.nextInt();
		
		amount=amount-w;
		
		
	}
	
	void display() {
	
		System.out.println("Account Number="+accno);
		System.out.println("Name="+name);
		System.out.println("Balance Amount="+amount);	
		
	}
}

class BankAccount {
	
	public static void main(String[] args) {
		
		int n;
		
		Account obj=new Account();
		obj.insert();
				
				
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice, 1.Deposit, 2.Withdraw"); n=scan.nextInt();
		
		
		switch(n) {
			
					obj.deposit();
			case 1:
					break;
			case 2:
					obj.withdraw();
					break;
			default:
					System.out.println("Select the correct option.");
		}
		
		obj.display();
		
	}
}