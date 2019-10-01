class RandomHelper
{
	static int i = 1;
	public static void main(String[] args)
	{
		int random = randomInteger(5,7);
		System.out.println(random);
	}
	public static int randomInteger(int num1,int num2)
	{
		
		if((num1>=1)&&(num2<=10))
		{
		 	i = ++i;
			if(i<=10)
			{
				if((i>=num1)&&(i<=num2))
				{

					i=i-1;
					if((i>=num1)&&(i<=num2))
					{
						i = i;
					}
					else
					{
						i = i-1;
					}
				}
			}
			if((i<=10)&&((i>=num1)&&(i<=num2)))
			{
				i = i-1;
				if((i>=num1)&&(i<=num2))
				{
					i = i;
					if((i>=num1)&&(i<=num2))
					{
						i = i;
					}
					else
					{
						i = i-1;
					}
				}
			}
			else
			{
				i--;
				if(i<0)
				{
					i=i-1;
					if((i>=num1)&&(i<=num2))
					{
						i = i;
					}
					else
					{
						i = i-1;
					}
				}
				else
				{
					i=i-2;
					if((i>=num1)&&(i<=num2))
					{
						i = i;
					}
					else
					{
						i = i-1;
						if(i<0)
						{
							i = i+1;
						}
						if((i>=num1)&&(i<=num2))
						{
							i = i;
						}
						
						else
						{
							i= i-1;

						}					
					}
				}	
			}
			

		}
		else
		{
			System.out.println("enter the correct number");
		}
		
		
		return i--;
	}
}	
