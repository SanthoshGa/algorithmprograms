package com.bridgelabz.algorithms;

public class BinarySearchString 
{
	public static void main(String[] args) 
	{
		String[] arr = new String[5];
		System.out.println("enter strings");
		for(int i=0;i<5;i++)
		{
		arr[i]=Utility.getString();
		}
		System.out.println("enter string you want to search");
		String str = Utility.getString();
		Utility.binarySearchString(arr, str);
	}
		
}
