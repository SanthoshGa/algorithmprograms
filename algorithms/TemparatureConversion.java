package com.bridgelabz.algorithms;

import java.util.Scanner;

public class TemparatureConversion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temparature :");
		float temperature = Utility.getNumber();
		System.out.println("enter unit - f for fahrenheit/c-for celsius");
		char currentUnit = sc.next().charAt(0);
		float  d = Utility.convertTemperature(temperature, currentUnit);
		System.out.println(d);
	}
}
