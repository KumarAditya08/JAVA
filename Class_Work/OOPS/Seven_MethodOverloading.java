package OOPS;

class Student
{
	int id = 8;
	String name = "Aditya";
	
	public void show()
	{
		System.out.println("Hello");
	}
	
	public void show(int i)
	{
		System.out.println("Hi");
	}
	
	public void display()
	{
		System.out.println("World");
	}
}


public class Seven_MethodOverloading {
      public static void main(String args[])
      {
    	  Student obj = new Student();
    	  obj.show(67);
      }
}

