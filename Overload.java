public class Overload
{

	
	public static void main(String[] args)
	{
		//initializing the integer ,double and character arrays
		int[] intArray = {1,2,3,4,5};
		double[] doubleArray = {2.0,3.0,4.0,5.0};
		char[] charArray = {'a','b','c','d'};
		printingArray( intArray);
		printingArray(  doubleArray);
		printingArray( charArray);	
	}
	//defining the overloaded methods
	public static void printingArray(int[] intArray)
	{
		
		for(int i=0;i<=intArray.length-1;i++)
		{
			System.out.println(intArray[i]);
		}
	}
	public static void printingArray(double[] doubleArray)
	{
		
		for(int i=0;i<=doubleArray.length-1;i++)
		{
			System.out.println(doubleArray[i]);
		}
	}
	public static void printingArray(char[] charArray)
	{
		
		for(int i=0;i<=charArray.length-1;i++)
		{
			System.out.println(charArray[i]);
		}
	}
}
	
		
