public class Sorting
{
	public static void main(String[] args)
	{
		int[] array = {50,40,30,20,10};		
		for(int i=0;i<=array.length-2;i++)
		{
			for(int j=0;j<=array.length-2-i;j++)
			{
			
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
		}
		for(int k:array)
		{
			System.out.println(k);
		}
	}
}
