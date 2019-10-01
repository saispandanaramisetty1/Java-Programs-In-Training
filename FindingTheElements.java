
import java.util.Scanner;
public class FindingTheElements
{
	public static void main(String[] args)
	{
		//initializing the scanner class 
		Scanner sc = new Scanner(System.in);
		int searchElement = 0;
		int count = 0;
		//intializing the array
		int[] array = {1,4,34,56,7};
		System.out.println("enter the number you want to search ");		
		try
		{
			searchElement = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("enter the correct integer number ");
		}
		for(int i=0;i<=array.length-1;i++)
		{

			if(searchElement==array[i])
			{
				count =1;
				System.out.println("the search element "+ searchElement+" is found at the position "+i);
			}
	
			
			
			
		}
		
		if(count == 0)
		{
			System.out.println("the search element "+ searchElement+" is not found -1 ");
		}
		
		//closing the scanner class
		sc.close();
			
			
	}
}
