abstract class GeneralBank
{
	abstract double getSavingInterestRate();
	abstract double getFixedInterestRate();
}
class ICICI extends GeneralBank
{
	//intializing the values
	double balance = 120000.0;
	double savingsRate = 0.0;
	double savingsAmount = 0.0;
	double fixedRate = 0.0;
	double fixedAmount = 0.0;
	double getSavingInterestRate()
	{
		 savingsRate = 0.04; 
		savingsAmount = savingsAmount+balance*savingsRate;
		return savingsAmount;
	}
	double getFixedInterestRate()
	{
		 fixedRate = ((8.5)/100);
		 fixedAmount = fixedAmount+balance*fixedRate;
		return fixedAmount;
	}
}
class KotMBank extends GeneralBank
{
	//intializing the values
	double balance = 130000.0;
	double savingsRate = 0.0;
	double savingsAmount = 0.0;
	double fixedRate = 0.0;
	double fixedAmount = 0.0;
	double getSavingInterestRate()
	{
		 savingsRate = 0.06; 
		savingsAmount = savingsAmount+balance*savingsRate;
		return savingsAmount;
	}
	double getFixedInterestRate()
	{
		 fixedRate = 0.09;
		 fixedAmount = fixedAmount+balance*fixedRate;
		return fixedAmount;
	}
}
class Bank
{
	public static void main(String[] args)
	{
		//creating the object for ICICI class
		ICICI i = new ICICI();
		System.out.println("the rate of saving interest rate is "+i.getSavingInterestRate());
		System.out.println("the rate of fixed interest rate is "+i.getFixedInterestRate());

		//creating the object for KotMBank class
		KotMBank kb = new KotMBank();
		System.out.println("the rate of saving interest rate is "+kb.getSavingInterestRate());
		System.out.println("the rate of fixed interest rate is "+kb.getFixedInterestRate());

		//creating the object for ICICI and stored in GeneralBank class
		GeneralBank gb1 = new ICICI();
		System.out.println("the rate of saving interest rate is "+gb1.getSavingInterestRate());
		System.out.println("the rate of fixed interest rate is "+gb1.getFixedInterestRate());

		//creating the object for KotMBank and stored in GeneralBank class
		GeneralBank gb2 = new KotMBank();
		System.out.println("the rate of saving interest rate is "+gb2.getSavingInterestRate());
		System.out.println("the rate of fixed interest rate is "+gb2.getFixedInterestRate());		
			
	}
} 
