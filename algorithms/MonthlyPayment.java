package com.bridgelabz.algorithms;

public class MonthlyPayment 
{
	public static void main(String[] args) 
	{
		double p = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double r = Double.parseDouble(args[2]);
		System.out.println("monthly payment is:");
		double m = Utility.monthlyPayment(p,r,y);
		System.out.println(m);	
	}
}



