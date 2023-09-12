/*
Array in java
Homogeneous collection of elements
*/


class Array {
	
	public static void main(String[] args) {
		
		// For dynamic allocation during Runtime
		//int a[]=new int[]; 
		// For a fixed size
		//int a[]=new int[5];
		
		int a[]={14,23,33,56,66};
		/*
		a[0]=15;
		a[1]=23;
		a[2]=33;
		a[3]=56;
		a[4]=66;
		*/
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}	
		
		/*
		//For each, //Traversing array using for each loop
		for(int i:a)
			System.out.println(i);
		*/
	}
}