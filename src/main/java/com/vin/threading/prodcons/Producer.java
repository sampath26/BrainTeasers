package com.vin.threading.prodcons;

import java.util.Random;

public class Producer implements Runnable{

	private Mediator mediator;
	
	public Producer(Mediator mediator) {
		this.mediator = mediator;
	}
	
	private String[] inputMessages = {"one", "two", "three", "four", "five"};
	private Random random = new Random();
	
	public void run() {
		
		for (int i = 0; i < inputMessages.length; i++) {			
			mediator.put(inputMessages[i]);
			try {
				Thread.sleep(random.nextInt(5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		mediator.put("DONE");
	}

}
