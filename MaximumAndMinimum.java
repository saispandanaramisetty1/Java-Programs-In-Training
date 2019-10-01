public class MaximumAndMinimum
{
	public static void main(String[] args)
	{
		int[] array = {2,5,6,7,8,9};
		int max = array[0];
		int min = array[0];
		
		//for finding the maximum and minimum value
		for(int i=1;i<array.length;i++)
		{
			if(max<array[i])
			{
				max = array[i];
				
			}
			if(min>array[i])
			{
				
				min = array[i];
			}
			
		}
		System.out.println("the maximum element in the array is "+max);
		
		System.out.println("the minimum element in the array is "+min);
	}

}
