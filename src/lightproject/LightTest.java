package lightproject;

import java.util.Scanner;

public class LightTest
{
    public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the type of light");
	String type=sc.nextLine();
	iSwitch light=lightfactory.getLight(type);
	if(light!=null)
	{
    light.sOn();
    light.sOff();
	}
}
}
