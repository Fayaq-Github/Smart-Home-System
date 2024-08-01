package smarthome;

import java.util.Scanner;

public class SmartLight implements Switch,lightcontrol,services 
{
	String colour;
	@Override
	public void changeColor(String colour) 
	{
		System.out.println("THE COLOR IS CHANGED TO " + colour);
	}

	@Override
	public void turnoff() 
	{
		System.out.println("THE SMART LIGHT IS TURNED OFF.");
	}

	@Override
	public void turnon() 
	{
		System.out.println("THE SMART LIGHT IS TURNED ON.");
		
	}
	
	@Override
	public void service() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("SELECT ANY OPERATION: \n1.TURN ON \n2.TURN OFF \n3.CHANGE COLOR\n4.MAIN MENU ");
		String input2 = scan.nextLine().toLowerCase().replace(" ", "");
		switch (input2) {
		case "turnon": {
							turnon();
							service();
							break;
						}
		case "turnoff": {
							turnoff();
							service();
							break;
						}
		case "changecolor": {
								System.out.println("ENTER THE COLOR TO BE DISPLAYED:");
								colour = scan.nextLine();
								changeColor(colour);
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
