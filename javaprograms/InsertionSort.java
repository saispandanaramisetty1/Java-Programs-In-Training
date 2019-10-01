import java.util.Scanner;
class InsertionSort 
{
    public static int[] initializingArray(Scanner scn)
    {
	//reading the size of the number
	System.out.println(" Enter the size of the array number you want ");
				
	int size =0;
				
	//handling input mismatch exception
	try 
	{
	  size = scn.nextInt();
	} 
	catch (Exception e)
	{
	  System.out.println("  the size should an integer");
	  
				
	}
	//creating the array using the size
	int[] arr = {};
	if(size>0)
	{
	  arr = new int[size];
					
	  System.out.println(" Enter the  array elements ");
					
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
	    
	 } 			
	catch (Exception e) 
	{
	   System.out.println(" enter the valid eliment");
	}
					
	}
				
    return arr;
				
  }
			
			 
    //sorting function
    public void sorting(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=1; i<n; i++) 
        { 
            int key = arr[i]; 
            int j = i-1; 
  
            
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
    } 
  
    //for printing the array
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; i++) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    // main method
    public static void main(String args[]) 
    { 
	        
        // declaring the scanner class for reading the numbers
	Scanner scn = new Scanner(System.in);
			
	int[] arr = initializingArray(scn);
  
        InsertionSort is = new InsertionSort();         
        is.sorting(arr); 
          
        printArray(arr); 
    } 
} 