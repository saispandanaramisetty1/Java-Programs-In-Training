public class SumAndAverage
{
	public static void main(String[] args)
	{
		int[] array = {2,3,5,6,7,8};
		int sum =0;
		for(int i=0;i<array.length;i++)
		{
			sum = sum+array[i];
		}
		System.out.println(sum);
		double average = ((sum)/(array.length));
		System.out.println(average);
	}
}
