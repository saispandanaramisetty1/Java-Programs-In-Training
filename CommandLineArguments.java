public class CommandLineArguments
{
	public static void main(String[] args)
	{
		if(args.length==0)
		{
			System.out.println(" no elements ");		
		}
		else
		{
			String num;
			for(int i=0;i<=args.length-1;i++)
			{
				num = args[i];
				System.out.print(num);
				if(i!=args.length-1)
				{
					System.out.print(",");
				}
			}
			System.out.println();
			
		}
	}
}
