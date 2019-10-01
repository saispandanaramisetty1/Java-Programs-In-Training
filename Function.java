import java.util.Scanner;
import java.lang.Math;
//declaring the constants in an interface
interface Constants 
{
 final long  C = 299792458 ;
 final double G = 6.67428*(Math.pow(10,-11));
 final double ACCELERATION =  9.80665;
 void calculateEnergy();
 void calculateForce();
 void calculateDisplacement();
 }

class Function implements Constants 
{
    Scanner sc = new Scanner(System.in);
        public static void main(String[] args) 
        {
            Function f1= new Function();
            f1.calculateEnergy();
            f1.calculateForce();
            f1.calculateDisplacement();

        }
    
    //overriding the energy method
        public void calculateEnergy() 
        {
        	double mass= 10;
        	double Energy=mass*C*C;
        	System.out.println("The energy is given by:" + Energy);
        }

        //overriding the force method
        public void calculateForce() 
        {
        	double m1=12;
        	double m2=13;
        	int radius=3;
        	double Force= G*(m1*m2)/radius;
        	System.out.println("The force is given by "+Force);
        }

        //overriding the displacement method
    	public void calculateDisplacement()
    	{
         	double time= 9;
         	double Displacement = 0.5*ACCELERATION*time;
         	System.out.println("The displacement is given by "+Displacement);
    	}

}