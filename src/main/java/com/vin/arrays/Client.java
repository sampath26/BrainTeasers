package com.vin.arrays;

public class Client {

	/**
	 * @param args
	 */
	public static void  main(String[] args) {
		int[] first = {3,5,1,2,10,6};
		int[] second = {1,6,3,5,2};
		
		VinArray va = new VinArray();
		System.out.println("uniqueNumber is : "+ va.getUniqueElement(first, second));
		

	}

}
