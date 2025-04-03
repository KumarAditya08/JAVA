package OOPS;


class Outer_Class
{
	private class Inner_Class
	{
		void display()
		{
			System.out.println("This is a private inner class");
		}
	}
	
	void show_inner()
	{
		Inner_Class c1 = new Inner_Class();
		c1.display();
	}
	
	
}


public class Two_Private_Inner
{
	public static void main(String args[])
	{
		Inner_Class c = new Inner_Class();   //Since Inner_Class is private, it cannot be accessed outside of Outer_Class, 
		c.display();                         //including from Two_Private_Inner.
	}
}



//Solution

//public class Two_Private_Inner
//{
//	public static void main(String args[])
//	{
//		Outer_Class c = new Outer_Class();   
//		c.show_inner();                        
//	}
//}
