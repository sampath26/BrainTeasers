package com.vin.arrays.sorting;

public class SortClient {

	public static void main(String[] args) {
		int[] input = {10, 6,1,5,2,3,4, 0, 7, 15, 9};
		printArray(input);
		MergeSort ms = new MergeSort(input);
		System.out.println("Sorted Array: ");
		printArray(ms.sort(input));
		

	}
	
	private static void printArray(int[] input)
	{
		for(int i = 0; i < input.length; i++)
		{
			System.out.println(input[i]);
		}
	}

}
