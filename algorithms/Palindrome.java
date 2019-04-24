package com.bridgelabz.algorithms;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		System.out.println("enter a string");
		String str = Utility.getString();
		if(Utility.isPalindrome(str))
		{
			System.out.println("given no is palindrome");
			
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
			

		
	}

}
