package OOPS;


class Parent
{
	int id = 59;
	String name = "Aditya";
	
	
	public void show()
	{
		System.out.println("Hello");
	}
}


class Child extends Parent
{
	int age = 10;
	
	public void display()
	{
		System.out.println("World");
	}
	
	@Override                                   // Optional
	public void show()
	{
		System.out.println("Hi");
	}
}



public class Seven_MethodOverriding {
   public static void main(String args[])
   {
	   Parent p = new Parent();
	   p.show();
	   
	   Child c = new Child();
	   c.show();
	   
	   Parent c1 = new Child();            // up-casting
	   
	   c1.show();
	   
//	   Child c2 = new Parent();   Child can't hold parent
	   
   }
}





