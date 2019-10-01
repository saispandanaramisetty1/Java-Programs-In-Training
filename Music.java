abstract class Instrument
{
	abstract void play();
}
class Piano extends Instrument
{
	void play()
	{
		System.out.println("Piano is palyiong tan tan tan tan ");
	}
}
class Flute extends Instrument
{
	void play()
	{
		System.out.println("Flute is palyiong toot toot toot toot ");
	}
}
class Guitar extends Instrument
{
	void play()
	{
		System.out.println("Guitar is palyiong tin tin tin tin ");
	}
}
class Music
{
	public static void main(String[] args)
	{
		Instrument[] ins = new Instrument[10];
		
		for(int i=0;i<=3;i++)
		{
			Instrument instrument1 = new Piano();
			
			instrument1.play();
			ins[i] = instrument1;
			
			
			
		}
		for(int i=4;i<=6;i++)
		{
			Instrument instrument2  = new Flute();
			
			instrument2.play();
			ins[i] = instrument2;
		}
		for(int i=7;i<=9;i++)
		{
			Instrument instrument3  = new Guitar();
			
			instrument3.play();
			ins[i] = instrument3;
		}
		
		for(int i=0;i<=9;i++)
		{
			if(ins[i] instanceof Piano)
			{
				System.out.println("Piano at index "+i);
			}

			else if(ins[i] instanceof Flute)
			{
				System.out.println("Flute at index "+i);
			}

			else if(ins[i] instanceof Guitar)
			{
				System.out.println("Guitar at index "+i);
			}
			else
			{
				System.out.println(" no element is found ");
			}
		}

		
	}
}
