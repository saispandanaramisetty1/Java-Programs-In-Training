public class CaluculationOfGrossOfEggs
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the mnumber of eggs you want");
		int eggs = scn.nextInt();
		if(eggs>0)
		{
			if(eggs>=144)
			{
				int gross = eggs/144;
				System.out.println("there are "+gross+" gross of eggs");
				eggs = eggs-(gross*144);
			}
			else if(eggs>=12)
			{
				int dozen = eggs/12;
				System.out.println("there are "+dozen+" dozen of eggs");
				eggs = eggs-(dozen*12);
			}
			else
			{
				remaining = eggs;
				System.out.println("there are "+remaining+" remaining of eggs");
			}
		}
	}
}

