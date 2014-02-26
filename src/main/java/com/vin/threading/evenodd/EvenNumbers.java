package com.vin.threading.evenodd;

public class EvenNumbers implements Runnable{

	private Printer printer;
	
	public EvenNumbers(Printer printer) 
	{
		this.printer = printer;
	}
	
	public void run()
	{
		for(int i = 0; i < 100 ; i = i+2)
		{
			printer.printEven(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}
