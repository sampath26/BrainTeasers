package com.vin.threading.evenodd;

public class OddNumbers implements Runnable{

	private Printer printer;
	
	public OddNumbers(Printer printer) 
	{
		this.printer = printer;
	}
	
	public void run() 
	{
		for(int i = 1; i < 100; i = i + 2)
		{
			printer.printOdd(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
