package TwoWheeler;

import java.util.Scanner;

import com.automobile.Vehicle;

 class Honda extends Vehicle{
	Scanner s=new Scanner(System.in);
	//getting the model name of the vehicle
	public String getModelName() {
		System.out.println("enter the honda model of the vehicle");
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
	//finding the cd player changability
	public void cdPlayer()
	{
		boolean player=true;
		if(player==true)
		{
			int cd=1;
			boolean change=true;
			if(change==true)
			{
				cd+=1;
				System.out.println("Hero vehicle current cd player is "+cd);
			}
		}
		else
		{
			System.out.println("there is no cdplayer facility in the vehical");
		}
	}

}
