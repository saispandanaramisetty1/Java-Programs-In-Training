package FourWheeler;

import java.util.Scanner;

public  class Logan extends com.automobile.Vehicle {
	Scanner s=new Scanner(System.in);
	//getting the model name of the vehicle
	public String getModelName() {
		System.out.println("enter the logan model of the vehicle");
		String modelName=s.next();
		return modelName;
	}
	//getting the registration number of the vehicle
	public String getRegistrationNumber() {
		System.out.println("enter the RegistrationNumber of the vehicle");
		String RegistrationNumber=s.next();
		return RegistrationNumber;
	}
	//getting the owner name of the vehicle
	public String getOwnerName() {
		System.out.println("enter the owner name of the vehicle");
		String OwnerName=s.next();
		return OwnerName;
	}
	//finding the speed of the vehicle
	public int getSpeed()
	{
		System.out.println("enter the time");
		int time=s.nextInt();
		System.out.println("enter the distance");
		int distance=s.nextInt();
		int speed=distance/time;
		return speed;
	}
	//finding location of the vehicle
	public int loc(int x,int y)
	{
		int mainLoc=(x+y)/2;
		if(x==50&&y==20)
		{
			System.out.println("Logan vehicle location is found");
		}
		else
		{
			System.out.println("Logan vehicle location not found ");
		}
		return mainLoc;
	}
	//finding gps of the vehicle
	public int gps()
	{
		int location1 = 0;
		boolean location=true;
		if(location==true)
		{
			int ipNum=98293;
			 location1=loc(50,20);
		}
		else
		{
			System.out.println("car don't have gps system");
		}
		return location1;
	}
}

