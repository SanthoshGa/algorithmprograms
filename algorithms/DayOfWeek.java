package com.bridgelabz.algorithms;

public class DayOfWeek 
{
	public static void main(String[] args) 
	{
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		int d =Utility.dayOfWeek(day, month, year);
		System.out.println(d);
	}

}
