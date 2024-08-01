package smarthome;

import java.util.Scanner;

public class VoiceAssistant implements Switch,voiceControl,services
{
	String color;
	int degree;
	@Override
	public void voiceCommand(String command) 
	{
		System.out.println(command);
	}

	@Override
	public void turnoff() 
	{
		System.out.println("THE VOICE ASSISTANT IS TURNED OFF.");
	}

	@Override
	public void turnon() 
	{
		System.out.println("THE VOICE ASSISTANT IS TURNED ON.");
	}

	@Override
	public void service() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("HI ! " + SmartSystem.name);
		System.out.println("HOW CAN I HELP YOU ? ");
		SmartLight sml = new SmartLight();
		SmartThermostat smt = new SmartThermostat();
		System.out.println("PLEASE ASSIST ME ONLY FROM BELOW OPTIONS: \n1.TURN ON LIGHT \n2.TURN OFF LIGHT \n3.CHANGE COLOR\n4.TURN ON THERMOSTAT \n5.TURN OFF THERMOSTAT \n6.CHANGE TEMPERATURE \n7.MAIN MENU ");
		String input4 = scan.nextLine().toLowerCase().replace(" ", "");
		switch (input4) {
		case "turnonlight": {
								sml.turnon();
								service();
								break;
							}
		case "turnofflight": {
								sml.turnoff();
								service();
								break;
							 }
		case "changecolor": {
								System.out.println("ENTER THE COLOR TO BE DISPLAYED:");
								color = scan.nextLine();
								sml.changeColor(color);
								service();
								break;
							 }
		case "turnonthermostat": {
									smt.turnon();
									service();
									break;
								 }
		case "turnoffthermostat": {
										smt.turnoff();
										service();
										break;
								  }
		
		case "changetemperature": {
									System.out.println("ENTER THE DESIRED TEMPERATURE. ");
									degree = scan.nextInt();
									smt.setTemperature(degree);
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
	}

}
