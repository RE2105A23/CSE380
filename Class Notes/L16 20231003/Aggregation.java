/*
Aggregation
*/

class Address {
	String city, state, country;
	
	Address(String city, String state, String country) {
		this.city=city; this.state=state; this.country=country;
	}
}

class Student {
	int rollno; String name;
	Address obj;
	Student(int rollno, String name, Address obj) {
		this.rollno=rollno; this.name=name; this.obj=obj;
	}
	
	void show() {
		System.out.println("Rollno is=" +rollno);
		System.out.println("Name is=" +name);
		System.out.println("City is=" +obj.city);
		System.out.println("State is=" +obj.state);
		System.out.println("Country is=" +obj.country);
	}
}

class Aggregation {
	
	public static void main(String[] args) {
		
		Address obj1=new Address("NYC", "NY", "USA");
		Student obj2=new Student(123,"JASSY", obj1);
		
		obj2.show();
	}
	
}