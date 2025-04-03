package OOPS;

class J
{
	void message()
	{
		System.out.println("J");
	}
}

class H extends J
{
	void message()
	{
		System.out.println("H");
	}
	
	void display()
	{
		message();
		super.message();
	}
}

public class Nine_Super_Q2 {
      
	public static void main(String[] args)
	{
		H c1 = new H();
		c1.display();
	}
}
