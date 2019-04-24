package com.bridgelabz.algorithms;

import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 strings");
		String s1 = sc.next();
		String s2 = sc.next();
		char str1[] = new char[5];
		char str2[] = new char[5];
		str1=s1.toCharArray();
		str2=s2.toCharArray();
		if(Utility.areAnagram(str1,str2))
		{
			System.out.println("two strings are anagram of each other");
			
		}
		else
		{
			System.out.println("two strings are not anagram of each other");
		}
		
	}

}
