/*
Runtime Polymorphism using AbstractClass

Create a class name Bank and create 3 derived classes SBI PNB ICICI

*/

import java.util.Scanner;

abstract class Bank {
	
	int amount;
	double sbi, pnb, icici;
	
	//Scanner scan=new Scanner(System.in);
	
	Bank() {
		
		//amount=10000;
		
		//System.out.print("Enter the amount:");
		//amount=scan.nextInt();
		
	}
	
	void getData() {
		
		//amount=10000;
		
		//System.out.print("Enter the amount:");
		//amount=scan.nextInt();
		
	}
	
	
	{
		sbi=0.05;
		pnb=0.10;
		icici=0.07;
	}
	
	
	abstract void getReturns(int amount);

	
}

class SBI extends Bank {
	
	void getReturns(int amount) {
		//System.out.println(sbi+ " " + amount);
		double returns=amount*sbi;
		System.out.println("The returns amount of SBI:" +returns);
		
	}
}

class PNB extends Bank {
	
	void getReturns(int amount) {
		
		double returns=amount*pnb;
		System.out.println("The returns amount of PNB:" +returns);
		
	}
}

class ICICI extends Bank {
	
	void getReturns(int amount) {
		
		double returns=amount*icici;
		System.out.println("The returns amount of ICICI:" +returns);
		
	}
}


class AbstractClass {
	
	public static void main(String[] arg) {
		
		Scanner scan=new Scanner(System.in);
		
		int amount;
		
		System.out.print("Enter the amount:");
		amount=scan.nextInt();
		
		Bank obj;
		
		// Object should be created always for base class if created for derived class then it will show error
		// error: incompatible types: PNB cannot be converted to SBI, and so on...
		//SBI obj=new SBI();
		
		// Runtime polymorphism
		obj=new SBI();
		obj.getReturns(amount); // Interest is 5%
		
		obj=new PNB();
		obj.getReturns(amount); //Interest is 10%
		
		obj=new ICICI();
		obj.getReturns(amount); // interest is 7%
		
		//System.out.println("");
		
	}
}