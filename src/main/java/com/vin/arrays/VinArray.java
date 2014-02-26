package com.vin.arrays;

public class VinArray {
	
	/**
	 * Returns the Unique number. Two arrays which have same elements except one which is the unique number.
	 * @param first
	 * @param second
	 * @return uniqueNumber
	 */
	public int getUniqueElement(int[] first, int[] second) 
	{
		int uniqueElement = 0;
		int counter = 0;
		
		if(second.length > first.length)
		{
			int[] temp = first;
			first = second;
			second = temp;
		}
		
		for(int i = 0 ; i < first.length; i++)
		{
			for(int j = 0 ; j < second.length; j++)
			{
				counter = 0;
				if(first[i] == second[j])
				{
					counter++;
					break;
				}
			}
			if(counter == 0)
			{
				uniqueElement = first[i];
				break;
			}
			
		}
		
		return uniqueElement;
		
	}

}
