package com.vin.arrays.sorting;

import java.util.Arrays;

public class MergeSort implements Sort{

	private int[] input;
	
	private int[] temp;
	
	public MergeSort(int[] input) {
		super();
		this.input = input;
		this.temp = new int[input.length];
	}

	public int[] sort(int[] input) 
	{
		int low = 0;
		int length = input.length;
		this.divide(low, length - 1);
		
		return input;
	}
	
	private void divide(int low, int high) 
	{
		if(low < high)
		{
			int mid = (low+high)/2;
			divide(low, mid);
			divide(mid+1, high);
			merge(low, mid, high);
			
		}
		
	}
	
	private void merge(int low, int mid, int high)
	{
		for(int i = low; i <= high ; i++ )
		{
			temp[i] = input[i];
		}
		
		int i = low;
		int j = mid + 1;
		int k = low;
		
		while( i <= mid && j <= high)
		{
			if(temp[i] <= temp[j])
			{
				input[k] = temp[i];
				i++;
			}
			else {
				input[k] = temp[j];
				j++;
			}
			k++;
		}
		
		while(i <= mid)
		{
			input[k] = temp[i];
			k++;
			i++;
		}
	}
	
	

}
