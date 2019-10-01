public class CommandLineArguments
{
	public static void main(String[] args)
	{
		String[] array = args;
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
			
			
		}
		String[] s = array.split();
		System.out.println(s);
		
	}
	
}
