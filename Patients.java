
import java.util.Scanner;
class Patient
{
	String name;
	double weight;
	double height;
	public Patient(String name,double weight,double height)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public String getName()
	{
		return name;
	}
	public double bMI(double weight,double height)
	{
		double bMI = (((weight*2.2046)*(703))/((height/2.5)*(height/2.5)));
		return bMI;
	}
}
public class Patients
{
	public static void main(String[] args)
	{
		int count =1;
		//initializing the scanner class
		Scanner scn = new Scanner(System.in);
		Patient[] patient = new Patient[2];
		for(int i=0;i<=patient.length-1;i++)
		{
			System.out.println("enter the patient name ");
			String name = scn.next();
			System.out.println("enter the patient weight ");
			double weight = scn.nextDouble();
			System.out.println("enter the patient height ");
			double height = scn.nextDouble();
			
			
			//creating object
			Patient p = new Patient(name,weight,height);
			patient[i] = p;
		}
		for(int i=0;i<=patient.length-1;i++)
		{
			double bMI = patient[i].bMI(patient[i].weight,patient[i].height);
			if(bMI>25.0)
			{
				count =0;
				System.out.println(patient[i].getName());
			}
			
		}
		if(count==1)
		{
			System.out.println("there are no persons have BMI greater than 25.0");
		}
			
		
		//closing the scanner class
		scn.close();
		
		
	}
}
	
