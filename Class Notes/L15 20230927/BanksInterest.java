/*
Declare a class with a name "Bank" that is giving the interest to its customer
under banks -> SBI, PNB, IOB and ICICI
SBI -> giving interest of 10%
PNB -> 8%
IOB -> 11%
ICICI -> 7%
Take the principle amount from the user and calculate the interest based on the bank
as chosen by user. Use the appropriate the inheritace to solve this problem.
*/

import java.util.Scanner;

class A {
	
	int interest;
	double principle,returns;
	Scanner scan=new Scanner(System.in);
	
	A() {
		System.out.print("Enter the principle amount=");
		principle=scan.nextInt();
	}
	
}

/*
class Bank extends A {
	
	void SBI () {
		
		returns=(principle+(principle*(10/100)));
		System.out.println("Returns from SBI="+returns);
		
	}
	
	void PNB () {
		
		returns=(principle*(8/100));
		System.out.println("Returns from PNB="+returns);
		
	}
	
	void IOB () {
		
		returns=(principle*(11/100));
		System.out.println("Returns from IOB="+(principle+returns));
		
	}
	
	void ICICI () {
		
		returns=(principle*(7/100));
		System.out.println("Returns from ICICI="+(principle+returns));
		
	}
}
*/

class B extends A {
	
	returns=(principle+(principle*(10/100)));
	System.out.println("Returns from SBI="+returns);
	
}

class C extends A {
	
	returns=(principle+(principle*(10/100)));
	System.out.println("Returns from SBI="+returns);
		
}

class D extends A {
	
	returns=(principle+(principle*(10/100)));
	System.out.println("Returns from SBI="+returns);
	
}

class E extends A {
	
	returns=(principle+(principle*(10/100)));
	System.out.println("Returns from SBI="+returns);
	
}


class BanksInterest {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		Bank obj=new Bank();
		
		System.out.println("1.SBI 2.PNB 3.IOB 4.ICICI");
		System.out.print("Enter one option [1-4]:");
		int n=scan.nextInt();
		
		switch(n) {
			
			case 1:
				obj.SBI();
				break;
			case 2:
				obj.PNB();
				break;
			case 3:
				obj.IOB();
				break;
			case 4:
				obj.ICICI();
				break;
			default:
				System.out.println("Wrong option");
			
		}
		
	}
	
}