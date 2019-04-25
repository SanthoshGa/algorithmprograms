package com.bridgelabz.algorithmprograms;

public class VendingMachine 
{ 
		static int i,total;
		static int[] notes= {1000,500,100,50,10,5,2,1};
		static int money;
	  	public static int count(int money,int[]notes )
	  	{
	        int rem;
			if(money==0)
			{
				return -1 ;
			}
			else
			{
				if(money>=notes[i])
				{
					int calNotes =money/notes[i];
					rem = money%notes[i];
					money =rem;
					total += calNotes;
					System.out.println(notes[i]+"Rs notes are: " +calNotes );
				}
				i++;
				return count(money, notes);
			}
		}
		public static void main(String[] args)
		{
			try 
			{
				System.out.print("Enter the Amount: ");
				money =Utility.getNumber();	
				VendingMachine.count(money,notes);
				System.out.println("Total Number of Notes are: "+total);
			} 
			catch (Exception e) 
			{
				System.out.println("Enter valid input");
			}
		}
	
	}


