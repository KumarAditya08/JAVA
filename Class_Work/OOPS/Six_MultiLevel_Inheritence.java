package OOPS;



class E
{
	void greet()
	{
		System.out.println("This is class E");
	}
}


class F extends E
{
	void display()
	{
		System.out.println("This is class F");
	}
}


class G extends F
{
	void show()
	{
		System.out.println("This is class G");
	}
}





public class Six_MultiLevel_Inheritence {
	public static void main(String args[])
	{
		G obj = new G();
		obj.show();
		obj.display();
		obj.greet();
	}
}
