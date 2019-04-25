package com.bridgelabz.algorithms;

public class Binary 
{
  public static void main(String[] args) 
	{
		System.out.println("enter a number");
		int number = Utility.getNumber();
		String s1=Utility.toBinary(number);
		System.out.println(s1);
		
		String s2=Utility.swappedNibbles(s1);
		System.out.println(s2);
		int array[]=new int[10];
		int num=Integer.parseInt(s2);
		int i=0;
		int sum=0;
		while(num>0)
		{
			
		int rem=num%2;
			
			sum+=rem*Math.pow(2, i);
			num=num/10;
			i++;
		}
	System.out.println(sum);
	}

}
