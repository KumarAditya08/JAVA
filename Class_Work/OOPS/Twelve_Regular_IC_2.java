package OOPS;

public class Twelve_Regular_IC_2 {
       
	class Twelve_Regular_IC_2_Inner
	{
		int roll = 21;
		String name = "Aditya";
		
		void display()
		{
			System.out.println("ROLL NUMBER : "+roll+" NAME : "+name);
		}
	}
	
	public static void main(String ... args)
	{
		Twelve_Regular_IC_2 c = new Twelve_Regular_IC_2();
		
		Twelve_Regular_IC_2.Twelve_Regular_IC_2_Inner i = c.new Twelve_Regular_IC_2_Inner();
		
		i.display();
	}
}
