package lightproject;

public class lightfactory 
{

	public static iSwitch getLight(String type)
	{
		if(type.equalsIgnoreCase("ledlight"))
		{
			return new Ledlightimpl();
		}
		else if(type.equalsIgnoreCase("tubelight"))
		{
			return new Tubelightimpl();
		}
		else
		{
			System.out.println("No such light found");
			return null;
		}
	}
}
