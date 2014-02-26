package com.vin.fileio;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.HashSet;

public class FileOps {
	
	public void removeDeplicates(String filePath)
	{
		try
		{
			File inputFile = new File(filePath);
			InputStream stream = this.getClass().getClassLoader().getResourceAsStream(filePath);
			Scanner scanner = new Scanner(stream);
			Set<String> wordSet = new LinkedHashSet<String>();
			
			while(scanner.hasNext())
			{
				StringTokenizer st = new StringTokenizer(scanner.next());
				long i = 1;
				while(st.hasMoreElements())
				{
					wordSet.add(st.nextToken());
				}
			}
			
			StringBuilder builder = new StringBuilder();
			for(String token: wordSet)
			{
				builder.append(token).append(" ");
			}
			System.out.println(builder.toString());
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
