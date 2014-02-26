package com.vin.algos;

public class LLClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("Sampath");
		list.add("Vinay");
		list.add("kumar");
		list.add("Prathima");
		list.add("Ungarala");
		list.display();
		list.deleteFromEnd(5);
		list.display();
		list.deleteFromStart(2);
		list.display();     
		list.insertAtPosition("anil", 2);
		list.display();

	}

}
