package smarthome;

import java.util.Scanner;

public class SmartThermostat implements Switch,temperatureControl,services
{
	int degree;
	@Override
	public void setTemperature(int degrees) 
	{
		System.out.println("THE TEMPERATURE IS CHANGED TO " + degrees + " DEGREES.");	
	}

	@Override
	public void turnoff() 
	{
		System.out.println("THE SMART THERMOSTAT IS TURNED OFF.");
	}

	@Override
	public void turnon() 
	{
		System.out.println("THE SMART THERMOSTAT IS TURNED ON.");
	}

	@Override
	public void service() {
		Scanner scan = new Scanner(System.in);
		System.out.println("SELECT THE ANY OPERATION: \n1.TURN ON \n2.TURN OFF \n3.CHANGE TEMPERATURE\n4.MAIN MENU ");
		String input3 = scan.nextLine().toLowerCase().replace(" ", "");
		switch (input3) {
		case "turnon": {
							turnon();
							service();
							break;
					   }
		
		case "turnoff" :{
							turnoff();
							service();
							break;
						}
		case "changetemperature" : {
										System.out.println("ENTER THE DESIRED TEMPERATURE. ");
										degree = scan.nextInt();
										setTemperature(degree);
										service();
										break;
									}
		case "mainmenu" : {
								SmartSystem.service();
								break;
						  }
		default : System.out.println("PLEASE SELECT VALID OPERATION.");
				  break;
		}
		scan.close();
	}

}
