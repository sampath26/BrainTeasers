package com.vin.threading.prodcons;

public class Mediator {
	
	private String message;
	
	private boolean empty = true;
	
	public synchronized String take()
	{
		while(empty)
		{
			try {
				wait();
			} catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		empty = true;
		notifyAll();
		return message;
	}
	
	public synchronized void put(String message)
	{
		while(!empty)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = false;
		this.message = message;
		notifyAll();
	}

}
