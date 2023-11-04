/*
Program - written code
Process - Proram in execution
Thread - Multiple Processes
Runnable Methods -> Objects

Runnable class in lambda expression/annonymous class

Thread is a same process but diferent tasks

*/

class RunnableLamda {

	public static void main(String[] args) {
		
		//Annonymous class
		Runnable obj1 = new Runnable() {
			
			public void run() {			
				System.out.println("Thread1");
			}
			
		};
		
		Thread t1 = new Thread(obj1); //creation of first thread
		t1.start(); // Allow thread to execute
		//Lambda expression
		Runnable obj2 = () -> {
			System.out.println("Thread2");
		};
		Thread t2 = new Thread(obj2); //creation of second thread
		t2.start(); // Allow thread to execute
	}
}
