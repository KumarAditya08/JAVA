package OOPS;

class Big
{
	void show()
	{
		System.out.println("Parent");
	}
}

class Small extends Big
{
	void show()
	{
		super.show();
		System.out.println("Child");
	}
}

public class Nine_Super_Method {
    
	public static void main(String args[])
	{
		Small c1 = new Small();
		c1.show();
	}
}
