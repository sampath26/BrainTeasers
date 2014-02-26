package com.vin.threading.evenodd;

public class Printer {

	private boolean even = true;
	
	public synchronized void printEven(int number)
	{
		while(!even)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		even = false;
		System.out.println(Thread.currentThread().getName() + ": " + number);
//		System.out.println(number);
		notifyAll();
		
	}
	
	public synchronized void printOdd(int number)
	{
		while(even)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		even = true;
		System.out.println(Thread.currentThread().getName() + ": " + number);
//		System.out.println(number);
		notifyAll();
		
	}
		
}
