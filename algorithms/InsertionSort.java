package com.bridgelabz.algorithms;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int[] arr= new int[10];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Utility.getNumber();
		}
		System.out.println("Before Insertion Sort");
		Utility.printArray(arr);
		Utility.insertionSort(arr);
		System.out.println("after insertion sort");
		Utility.printArray(arr);
		
	}	
}
