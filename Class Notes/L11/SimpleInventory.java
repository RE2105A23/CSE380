/*
WAP - Create an inventory management system
where maxProductSize=10 is given and user will see the menu
of four option:
1. add Product
2. display product
3. search product
4. exit

user can enter the product upto the value of 10 only.

During the add product
-> product name, product price;
-> Error "Maximum entry limit reached."

search product 
-> search with product name

display product


*/

import java.util.Scanner;


class Product {
	
	//Max Entry Limit -> //MaxProductSize
	int n=2;
	//int count=0;
	String pName[]=new String[n]; //String[] pName
	double pPrice[]=new double[n]; //double[] pPrice
	
	void addProduct() {
		
		if(count<n) {
			
			Scanner scan=new Scanner(System.in);
			
			for(int i=0;i<n;i++) {
			
				System.out.print("Enter product name: ");
				pName[i]=scan.nextLine();
				System.out.print("Enter product price: ");
				pPrice[i]=Double.parseDouble(scan.nextLine());
				
				count++;
			}
			/*
			
			System.out.print("Enter product name: ");
			pName[count]=scan.nextLine();
			System.out.println("Enter product price: ");
			pPrice[count]=Double.parseDouble(scan.nextLine());
			
			count++;
			*/
			System.out.println("Product added.");
					
		}
		else {
			
			System.out.println("Maximum capacity reached.");
		}
		
	}
	
	void displayProduct() {
		
		for(int i=0;i<count;i++) {
		
			System.out.print("Product name: "+ pName[i]);
			System.out.println("Product price: "+ pPrice[i]);
	
		}
	}
	
	void searchProduct() {
		
		System.out.print("Enther a Product Name to search: ");
		
		//if not found, display product is not there!
	}
}


class SimpleInventory {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		int count=0;
		
		while(true) {
			
			System.out.println("1.Add 2.Display 3.Search 4.Exit");
			System.out.print("Enter your choice= ");
			//Whenever we are using multiple inputs, use Integer.parseInt()
			int choice=Integer.parseInt(scan.nextLine());
			
			Product p1=new Product();
			
			switch(choice) {
				
				case 1:
					p1.addProduct();
					break;
				case 2:
					p1.displayProduct();
					break;
				case 3:
				case 4:
					return;
				default :
					System.out.println("Incorrect input");
					break;
			
			}
		}
	}
}
		
		