package OOPS;

class Animal{
	
}



public class Eight_InstanceOf_1 extends Animal {
	
      
	public static void main(String args[])
	{
		String name = "Aditya";
		
		boolean res1 = name instanceof String;
		System.out.println(res1);
		
		
		
		Eight_InstanceOf_1 obj = new Eight_InstanceOf_1();
		
		boolean res2 = obj instanceof Eight_InstanceOf_1;
		
		System.out.println(res2);
		
		
		boolean res3 = obj instanceof Animal;
		
		System.out.println(res3);
		
		
		boolean res4 = obj instanceof Object;  // Object class is the superclass of all classes in Java.
		
		System.out.println(res4);
	}
}
