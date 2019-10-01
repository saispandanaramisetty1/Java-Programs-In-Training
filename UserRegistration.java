
import java.util.Scanner;

public class UserRegistration
{
	

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the userName and country");
		String userName = sc.next();
		String userCountry = sc.next();
		sc.close();
		try 
		{
			registerUser(userName,userCountry );
		} 
		catch (InvalidCountryException e) 
		{
			System.out.println(e);
		}
	}
	static void registerUser(String userName,String userCountry) throws InvalidCountryException
	{
		if(userCountry.equals("india"))
		{
			System.out.println("user registartion done successfully");
		}
		else
		{
			throw new InvalidCountryException();
		}
	}
}
class InvalidCountryException extends Exception
{
	
	String country;
	InvalidCountryException() 
	{
		
	}
	InvalidCountryException(String country) 
	{
		this.country=country;
		
	}
	public String toString() 
	{
		return "user outside India can not be registered";
	}
	
}


