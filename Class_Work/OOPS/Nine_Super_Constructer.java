package OOPS;


class Baap
{
	Baap()
	{
		System.out.println("Parent Constructer");
	}
}

class Bacha extends Baap
{
	Bacha()
	{
//		super();    No matter super()  , jvm automatically put it here
		System.out.println("Child Constructer");
	}
}

public class Nine_Super_Constructer {
    public static void main(String args[])
    {
    	Bacha b = new Bacha();
    }
}
	