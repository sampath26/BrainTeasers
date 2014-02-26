package com.vin.threading.prodcons;

public class ProducerConsumerClient {

	public static void main(String[] args) {
	
		Mediator mediator = new Mediator();
		
		new Thread(new Consumer(mediator)).start();
		
		new Thread(new Producer(mediator)).start();
	}

}
