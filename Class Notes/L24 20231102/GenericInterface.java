/*
Generic Interfaces

Sum of N number
Sum of N characters

*/

interface A <T extends Number> {
	
	//T show();
	T show(T t);
	
}

/*
class Sum <T extends Number> {
	
	T t;
	
	sum(T t) {
		this.t=t
	}
	
	
	T show() {
		
		T t = 10;
		
		for(int i=0;i<t.length();i++) {
			
			t+=i;
			
			return T;
		}
	}	
}
*/

class GenericInterface {
	
	
	public static void main(String[] args) {
		
		//int n;
		
		A <Integer> obj = (n) -> {
			
			int sum;
			for(int i=0;i<n;i++) {
				sum+=i;
			}
			return sum;
		};
		
		System.out.println(obj.show(5));
		
	}
	
}