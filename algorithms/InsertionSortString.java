package com.bridgelabz.algorithms;

public class InsertionSortString 
{
	public static void main(String[] args) 
	{
		String[] arr= new String[5];
		System.out.println("enter strings");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Utility.getString();	
		}
		String[] sortedArray=Utility.insertionSortForString(arr);
		System.out.println("sorted strings are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(sortedArray[i]);
		}	
	}
}
