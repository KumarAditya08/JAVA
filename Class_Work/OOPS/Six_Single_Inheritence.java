package OOPS;


class A
{
	void show()
	{
		System.out.println("This is class A");
	}
}


class B extends A
{
	void show()
	{
		System.out.println("This is class B");
	}
}




public class Six_Single_Inheritence {
      
	public static void main(String args[])
	{
		B obj = new B();
		obj.show();
		A obj_2 = new A();
		obj_2.show();
	}
}
