package com.bridgelabz.algorithms;

public class ToBinary
{
public static void main(String[] args) 
{
	System.out.println("enter a number");
	int number = Utility.getNumber();
	String bin = Utility.toBinary(number);
	System.out.println(bin);
	
}
}
