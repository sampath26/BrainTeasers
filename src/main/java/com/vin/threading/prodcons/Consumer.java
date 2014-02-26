package com.vin.threading.prodcons;

import java.util.Random;

public class Consumer implements Runnable{

	private Mediator mediator;
	
	private Random random = new Random();
	
	public Consumer(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void run() {

		for(String message = mediator.take(); !message.equals("DONE"); message = mediator.take())
		{
			System.out.println("Message Taken by the mediator: " + message);
			try {
				Thread.sleep(random.nextInt(5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Completed!!!!");
	}
	

}
