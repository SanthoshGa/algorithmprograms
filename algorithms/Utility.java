package com.bridgelabz.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Utility 
{
	
	static Scanner sc = new Scanner(System.in);
	public static boolean areAnagram(char[] str1,char[] str2)
	{
		int n1 = str1.length;
		int n2 = str2.length;
		
		if(n1!=n2)
		{
			return false;
		}
		else
		{
			Arrays.sort(str1);
			Arrays.sort(str2);
		
			for(int i =0;i<n1;i++)
			{
				if(str1[i]!=str2[i])
				{
					return false;
				}
				else
				{
					return true;
				}
			
			}
			return true;	
	}
	}
	public static boolean isPrime(int number) {

		// condition to check if no less than two
		if (number < 2) 
		{
			return false;
		}

		// for loop to for checking prime no
		for (int factor = 2; factor * factor <= number; factor++) 
		{
			// if factor divides evenly into n, n is not prime, so break out of
			// loop
			if (number % factor == 0) 
			{
				
				return false;
			}
		} // End of for loop
		return true;
	
	}
	
	public static void printPrimes() 
	{
		int number = 0;
		for (number = 0; number <= 1000; number++) {
			if (isPrime(number)) 
			{
				System.out.println(number);
			}
		}
	}
	public static boolean isPalindrome(String str) 
	{
		char arr[] = str.toLowerCase().toCharArray();
		boolean isPalindrome = true;
		int j = arr.length - 1;
		for (int i = 0; i < arr.length; i++, j--) 
		{
			if (arr[i] == arr[j]) 
			{
				isPalindrome = true;
			} 
			else 
			{
				isPalindrome = false;
				return isPalindrome;
			}
		}
		return isPalindrome;

	}
	public static void printPrimePalindrome() 
	{
		for (int number = 2; number < 1000; number++) 
		{
			if (isPrime(number)) 
			{
				if (isPalindrome(Integer.toString(number))) 
				{
					System.out.println(number);
				}
			}
		}
	}
	public static boolean binarySearch(int arr[], int num) 
	{

		int low = 0;
		boolean isPresent = false;
		int high = arr.length - 1;
		int mid = high / 2;
		while (high >= low) 
		{
			if (arr[mid] == num) 
			{
				isPresent = true;
				System.out.println("element found at "+mid);
				break;
			}
			else if (arr[mid] > num) 
			{
				high = mid - 1;
				mid = (low + high) / 2;
			} 
			else if (arr[mid] < num) 
			{
				low = mid + 1;
				mid = (low + high) / 2;
			}
		}
		return isPresent;
	}
	public static <T extends Comparable<T>> boolean  binarySearchString(T arr[],T str)
	{
		int low = 0;
		boolean isPresent = false;
		int high = arr.length - 1;
		int mid = high / 2;
		while (high >= low) {
			if (arr[mid].compareTo(str) == 0) 
			{
				isPresent = true;
				System.out.println("given word present at "+mid+" position" );
				break;
			}
			else if (arr[mid].compareTo(str) < 0) 
			{
				low = mid + 1;
				mid = (low + high) / 2;
			} else if (arr[mid].compareTo(str) > 0) 
			{
				high = mid - 1;
				mid = (low + high) / 2;
			}
		}
		return isPresent;
		
	}
	
		
 public static void insertionSort(int[] arr)
{
	Utility u = new Utility();
	int temp,j;
	for(int i=1;i<arr.length;i++)
	{
		temp = arr[i];
		j=i;
		while(j>0 &&arr[j-1]>temp)
		{
			arr[j]=arr[j-1];
			j=j-1; 
		}
		arr[j]=temp;
	}
}
public static void bubbleSort(int[] arr)
{
	for(int i=0;i<arr.length;i++)
	{
		 int flag=0;
		 int temp;
		for(int j=0;j<arr.length-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]=temp;
				flag=1;
			}
		}
		if(flag==0)
		{
			break;	
		}
	}	
}
public static void printArray(int[] arr)
{
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
}
public static String[] insertionSortForString(String[] arr)
{
	String temp ="";
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i].compareToIgnoreCase(arr[j])>0)
			{
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return arr;
}
public static String[] bubbleSortForString(String[] arr)
{
	String temp="";
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length-1-i;j++)
		{
			if(arr[j+1].compareToIgnoreCase(arr[j])<0)
			{
				temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		}
	}
	return arr;
	
}
public static void twoDArray()
{
	System.out.println("Enter 1 for integer array");
	System.out.println("Enter 2 for double array");
	System.out.println("Enter 3 for boolean array");
	int choice = Utility.getNumber();
	switch (choice)
	{
		case 1:
				System.out.println("Enter rows of array");
				int rows = Utility.getNumber();
				System.out.println("Enter coloums of array");
				int coloums = Utility.getNumber();
				int arr[][] = new int[rows][coloums];
				System.out.println("Enter your array");
				for (int i=0;i<arr.length;i++)
				{
					for (int j=0;j<arr.length;j++)
					{
						arr[i][j] = Utility.getNumber();
					}
				}
				for (int i=0;i<arr.length;i++)
				{
					for (int j=0;j<arr.length;j++)
					{
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println();
				break;
		case 2:
				System.out.println("Enter rows of array");
				int rowd = Utility.getNumber();
				System.out.println("Enter coloums of array");
				int coloumd = Utility.getNumber();
				
				double arrd[][] = new double[rowd][coloumd];
				System.out.println("Enter your array");
				for (int i=0;i<arrd.length;i++)
				{
					for (int j=0;j<arrd.length;j++)
					{
						arrd[i][j] = Utility.getDouble();
					}
				}
				for (int i=0;i<arrd.length;i++)
				{
					for (int j=0;j<arrd.length;j++)
					{
						System.out.print(arrd[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println();
				break;
			
		case 3:
				System.out.println("Enter rows of array: ");
				int rowb = Utility.getNumber();
				System.out.println("Enter coloums of array: ");
				int coloumb = Utility.getNumber();
				
				boolean arrb[][] = new boolean[rowb][coloumb];
				System.out.println("Enter your array");
				for (int i=0;i<arrb.length;i++)
				{
					for (int j=0;j<arrb.length;j++)
					{
						arrb[i][j] = Utility.getBoolean();
					}
				}
				for (int i=0;i<arrb.length;i++)
				{
					for (int j=0;j<arrb.length;j++)
					{
						System.out.print(arrb[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println();
				break;
	}
}
public static int getNumber() 
{
	int n=sc.nextInt();
	return n;
}
public static String getString()
{
	String str=sc.nextLine();
	return str;	
}

public static long start()
{
	long startTimer=System.currentTimeMillis();
	System.out.println("start time is "+startTimer);
	return startTimer;
}
public static long stop()
{
	long stopTimer=System.currentTimeMillis();
	System.out.println("stop time is "+stopTimer);
	return stopTimer;
}
public static long getElapsedTime(long start,long stop)

{
	long elapsed=stop-start;
	return elapsed;
	
}
public static void findNumber(int first, int last) 
{
	int middle = (first + last) / 2;
	if (first < last) 
	{
		System.out.println("Is your number between " + first + " and "
				+ middle + " [y/n]:");
		char choice = sc.next().charAt(0);
		if (choice == 'y' || choice == 'Y') 
		{
			findNumber(first, middle);

		} else {
			findNumber(middle + 1, last);
		}
	} else if (first == last) {
		System.out.println("Number is " + last);
	}
}
public static int dayOfWeek(int day, int month, int year) 
{
	int m0, y0, d0, x;

	y0 = year - (14 - month) / 12;
	x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
	m0 = month + 12 * ((14 - month) / 12) - 2;
	d0 = (day + x + (31 * m0) / 12) % 7;
	return d0;
}
public static float convertTemperature(float temperature, char currentUnit) 
{
	float conversion = 0.0f;
	if (currentUnit == 'f' || currentUnit == 'F') 
	{
		conversion = (temperature - 32) * ((float) 5 / 9);
	} 
	else if (currentUnit == 'c' || currentUnit == 'C') 
	{
		conversion = (temperature * ((float) 9 / 5)) + 32;
	}
	return conversion;
}
public static double monthlyPayment(double p, double y, double r) 
{
	double n =12*y;
	double r0 = r/12*100;
	double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
	return payment;
	
}

public static double sqrt(int c) 
{
	double epslion = 1e-15;
	double t = c;

	while (Math.abs(t - c / t) > epslion * t) 
	{
		t = (c / t + t) / 2;
	}
	return t;
}
public static String  toBinary(int number)
{
	int rem;
	String bin[] = {"0","1"};
	String binary = "";
	while(number>0)
	{
		rem=number%2;
		binary=bin[rem]+binary;
		number = number/2;
	}
	return binary;	
}

public static String swappedNibbles(String binary) 
{
	binary = binary.replaceAll(" ", "");
	String lowerNibble = binary.substring(0, 4);
	String upperNibble = binary.substring(4, 8);
	String swappedBinary = upperNibble + lowerNibble;
	return swappedBinary;
}

}


