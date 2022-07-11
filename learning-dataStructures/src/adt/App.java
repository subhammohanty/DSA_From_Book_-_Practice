package adt;

public class App {
	
	public static void main(String[] args) {
		
		Counter myCounter = new Counter("MyCounter");
		myCounter.increament();
		myCounter.increament();
		myCounter.increament();
		myCounter.increament();
		
		System.out.println(myCounter.getCurrentValue());
	}

}
