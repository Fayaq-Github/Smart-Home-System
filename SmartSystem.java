package smarthome;

import java.util.Scanner;

public class SmartSystem 
{
	public static String name;
	public static void service()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("SELECT THE SERVICES: \n1.SMART LIGHT\n2.SMART THERMOSTAT\n3.VOICE ASSISTANT.");
		String input = scan.nextLine();
		switch (input.toLowerCase().replace(" ", ""))
		{
		case "smartlight" : {
								SmartLight sl = new SmartLight();
								sl.service();
								service();
								break;
							}
		case "smartthermostat" :{
									SmartThermostat st = new SmartThermostat();
									st.service();
									service();
									break;
								}
		case "voiceassistant" :{
									VoiceAssistant va = new VoiceAssistant();
									va.service();
									service();
									break;
								}
		default : System.out.println("PLEASE SELECT VALID OPERATION.");
	  			  break;
		}
		
	}
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("PLEASE ENTER YOUR NAME: ");
		name = sc.nextLine();
		System.out.println("WELCOME TO SMART HOME SYSTEM.");
		service();
		sc.close();	
	}
}
