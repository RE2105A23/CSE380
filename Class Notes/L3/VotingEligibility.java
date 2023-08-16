
// Eligibility to vote or not
// If age is > 18 then allowed otherwise not allowed

import java.util.Scanner;

class VotingEligibility {
	public static void main(String[] args) {
		
		int a;
		Scanner obj=new Scanner(System.in);
		
		System.out.print("Enter an age to check the eligibility=");
		a=obj.nextInt();
		if(a>18) {
			System.out.println("Allowed");
		}
		//else if(a<18)
		else {
			System.out.println("Not Allowed");
		}
	}
}