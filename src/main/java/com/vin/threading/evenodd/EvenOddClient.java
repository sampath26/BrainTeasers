package com.vin.threading.evenodd;


public class EvenOddClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Printer printer = new Printer();
		EvenNumbers evenObj = new EvenNumbers(printer);
		OddNumbers oddObj = new OddNumbers(printer);
		Thread t1 = new Thread(evenObj);
		Thread t2 = new Thread(oddObj);
		
		t1.setName("EvenThread");
		t2.setName("OddThread ");
		
		t1.start();
		t2.start();
	}

}
