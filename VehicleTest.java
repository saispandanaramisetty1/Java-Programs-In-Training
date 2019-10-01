


package TwoWheeler;
import FourWheeler.Ford;
import FourWheeler.Logan;
public class VehicleTest {

	//main method
	public static void main(String[] args) {
		//creating object for hero class
		Hero hero=new Hero();
		int heroSpeed=hero.getSpeed();
		System.out.println("hero vehicle speed is "+heroSpeed);
		hero.radio();
		String heroModelName=hero.getModelName();
		System.out.println(heroModelName);
		String heroOwnerName=hero.getOwnerName();
		System.out.println(heroOwnerName);
		String heroRegistrationNumber=hero.getRegistrationNumber();
		System.out.println(heroRegistrationNumber);
		//creating object for honda class
		Honda honda =new Honda();
		int hondaSpeed=honda.getSpeed();
		System.out.println("honda vehicle speed is "+hondaSpeed);
		honda.cdPlayer();
		String hondaModelName=honda.getModelName();
		System.out.println(hondaModelName);
		String hondaOwnerName=honda.getOwnerName();
		System.out.println(hondaOwnerName);
		String hondaRegistrationNumber=honda.getRegistrationNumber();
		System.out.println(hondaRegistrationNumber);
		//creating object for logan class
		Logan logan=new Logan();
		logan.gps();
		System.out.println("Logan vehicle speed is "+logan.getSpeed());
		String loganModelName=logan.getModelName();
		System.out.println(loganModelName);
		String loganOwnerName=logan.getOwnerName();
		System.out.println(loganOwnerName);
		String loganRegistrationNumber=logan.getRegistrationNumber();
		System.out.println(loganRegistrationNumber);
		//creating object for ford class
		Ford ford=new Ford();
		ford.gps();
		System.out.println("ford vehicle speed is "+ford.getSpeed());
		String fordModelName=ford.getModelName();
		System.out.println(fordModelName);
		String fordOwnerName=ford.getOwnerName();
		System.out.println(fordOwnerName);
		String fordRegistrationNumber=ford.getRegistrationNumber();
		System.out.println(fordRegistrationNumber);
		int temperature=ford.tempControl();
		System.out.println(temperature);

	}

}









