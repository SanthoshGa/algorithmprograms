package com.bridgelabz.algorithms;
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		int number = Utility.getNumber();
			if(Utility.isPrime( number))
	        {
	            System.out.print("This is a Prime Number");
	        }
	        else
	        {
	            System.out.print("This is not a Prime Number");
	        }

	}

}
