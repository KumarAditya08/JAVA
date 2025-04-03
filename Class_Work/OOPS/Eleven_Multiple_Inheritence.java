package OOPS;

interface Father
{
	void name();
}

interface Mother
{
	void name();
	
	default void hello()
	{
		return;
	}
}

class Son implements Father , Mother{

	
	public void name() {
		
		System.out.println("Hello My Name Is Aditya");
		
	}
	
}



public class Eleven_Multiple_Inheritence {
       public static void main(String args[])
       {
    	   Son s1 = new Son();
    	   s1.name();
    	   s1.hello();
       }
}
