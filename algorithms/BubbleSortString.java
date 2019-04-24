package com.bridgelabz.algorithms;

public class BubbleSortString 
{
	public static void main(String[] args) 
	{
		String[] arr = new String[5];
		System.out.println("enter strings");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Utility.getString();
		}
		long start=System.currentTimeMillis();
		String[] sortedArray=Utility.bubbleSortForString(arr);
		long stop=System.currentTimeMillis();
		long ellipse=stop-start;
		System.out.println(ellipse);
		System.out.println("sorted strings are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(sortedArray[i]);
		}		
	}
}
