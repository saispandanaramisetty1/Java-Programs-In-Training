package org.java.app;

import java.util.Scanner;

public class Multiplication
{

	public static void main(String[] args) 
	{
		// declaring the scanner class for reading the numbers
		Scanner scn = new Scanner(System.in);
		
		int[] arr1 = initializingArray(scn,"first");
		ptintingArray(arr1);
					
		
		int[] arr2 = initializingArray(scn,"second");
		ptintingArray(arr2);
		
		System.out.println();
		
		//initializing the length to the resultant array
		int[]  resultArray;
			resultArray = new int[arr1.length+arr2.length];
			
			//multiplication of arrays
			int carry =0;int times=0;
			int[] temp = new int[resultArray.length];
			for(int i=0;i<resultArray.length-1;i++)
			{
				int res = resultArray.length-1-i;
				 int firstTerm,secondTerm,newTerm;
				for(int j=0;j<resultArray.length-1;j++)
				{
				firstTerm = (arr1.length-1-j)<0?0:arr1[arr1.length-j-1];
				secondTerm = (arr2.length-1-i)<0?0:arr2[arr2.length-1-i];
				newTerm = ((firstTerm*secondTerm)+carry)%10;
				carry = ((firstTerm*secondTerm)+carry)/10;
				if((res-j)>0)
				{
				temp[res-j] = newTerm;
				
				}
				else
				{
					temp[res-j] = newTerm;
					break;
				}
				  
				
				}
				times = times+1;
				resultArray = addingOfArrays(resultArray,temp,times);
			}
			ptintingArray(resultArray);
			
	}
	public static int[] initializingArray(Scanner scn,String nth)
	{
		//reading the size of the number
		System.out.println(" Enter the size of the "+nth+" number you want ");
		
		int size =0;
		
		//handling input mismatch exception
		try 
		{
			size = scn.nextInt();
		} 
		catch (Exception e)
		{
			// TODO: handle exception
		}
		
		//creating the array using the size
		int[] arr = {};
		if(size>=0)
		{
			arr = new int[size];
			System.out.println(" Enter the "+nth+" array elements ");
			
		}
		else
		{
			System.out.println(" size should be  greter than 0 ");
			size = scn.nextInt();
			
		}
		
		//reading the elements of an array
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			try 
			{
				arr[i] = scn.nextInt();
				while(arr[i]<0 || arr[i]>9)
				{
					System.out.println(" enter the valid element");
					arr[i] = scn.nextInt();
				}
			} 			
			catch (Exception e) 
			{
				System.out.println(" enter the valid eliment");
			}
			
		}
		
		return arr;
		
	}
	
	//for printing the array
	public static void ptintingArray(int[] printingArray)
	{
		for(int i=0;i<=printingArray.length-1;i++)
		{
			System.out.print(printingArray[i]);
		}System.out.println();
	}
	public static int[] addingOfArrays(int[]resultArray,int[] temp,int times)
	{
		int carry = 0;
		
			for(int j=resultArray.length-1-(times-1);j>=0;j--)
			{
				int prod =resultArray[j]+temp[j]+carry;
				
				if(prod>9)
				{
					int rem = prod%10;
					resultArray[j] = rem;
					prod = prod/10; 
					
					carry = prod;
					
				}
				else
				{
					resultArray[j] = prod;
					carry = 0;
				}
			}
		
		
		return resultArray;
	}
}

