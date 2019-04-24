package com.bridgelabz.algorithms;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[10];
		System.out.println("enter array elements");
		for(int i=0;i<10;i++)
		{
			arr[i]=Utility.getNumber();
		}
		System.out.println("enter element you want to search ");
    	int num = Utility.getNumber();
    	Utility.binarySearch(arr, num);
   }
}
