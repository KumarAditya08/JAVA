package OOPS;

class Y
{
	Y(int i)
	{
		System.out.println("Y");
	}
}

class X extends Y
{
	X()
	{
		super(46);   //here super is required
		System.out.println("X");
	}
}

public class Nine_Super_Constructer_2 {
     
	public static void main(String args[])
	{
		X s = new X();
	}
}
