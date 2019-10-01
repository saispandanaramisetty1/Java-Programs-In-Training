package org.java.app;

import java.util.Scanner;

public class SubtractionOfTwoArrays 
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
			
			//subtracting two arrays
			
			int resultArray[];
			
			//defining the size of the resultant array
			if(arr1.length>arr2.length)
			{
				resultArray = new int[arr1.length];
				
			}
			else if(arr2.length>arr1.length)
			{
				resultArray = new int[arr2.length];
			}
			else
			{
				resultArray = new int[arr2.length];
			}
			int borrow = 0;
			
	
			for(int i=0;i<=resultArray.length-1;i++)
			{
				
				int firstTerm,secondTerm,newTerm;
				firstTerm = (arr1.length-1-i)<0?0:arr1[arr1.length-1-i];
				secondTerm = (arr2.length-1-i)<0?0:arr2[arr2.length-1-i];
				if(arr1.length>arr2.length||(arr1.length==arr2.length))
				{
					if((firstTerm==secondTerm)||(firstTerm>secondTerm))
					{
						 newTerm = firstTerm-secondTerm-borrow;
						  
					}
					else 
					{
						borrow = 1;
						
						newTerm = -secondTerm+(firstTerm+10);
						
					
					}
					resultArray[resultArray.length-1-i] = newTerm;
					
					
				}
				
				else
				{	
					 borrow = 1;
					 newTerm = secondTerm-firstTerm;
					 resultArray[resultArray.length-1-i] = newTerm;
					 
				}
					if(borrow==1&&i==resultArray.length-1)
					{
						resultArray[resultArray.length-1-i] = -newTerm;
					}
			}
				
				
			
			ptintingArray(resultArray);
			
			//closing the scanner class
			scn.close();

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
					System.out.println(" size should be is greter than 0 ");
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
					System.out.print(printingArray[i]+" ");
	
				}
				System.out.println();
			}

}

