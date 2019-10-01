class FindingTheGreterNumber
{
	public static void main(String[] args)
	{
		int a = 20;
		int b = 20;
		int c = 20;
		if((a==b)&&(a>c))
		{
			System.out.println(" The greter elements are a,b "+a);
		}
		else if((b==c)&&(b>a))
		{
				System.out.println(" The greter elements are b,c "+b);
		}
		else if((c==a)&&(c>b))
		{
			System.out.println(" The greter elements are c,a "+c);
		}
		else if((a==b)&&(a==c))
		{
			System.out.println(" The greter elements are a,b,c "+a);
		}	
		else if((a>b)&&(a>c))
		{
			System.out.println(" The greter element is  a "+a);
		}
		else if((b>a)&&(b>c))
		{
			System.out.println(" The greter element is b "+b); 
		}
		
		else
		{
			System.out.println(" The greter element is c "+c);
		}
	}
}
