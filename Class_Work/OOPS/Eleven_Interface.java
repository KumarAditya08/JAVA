package OOPS;


interface Truck
{ 
	 final int arr = 0;
	  
	 static int n =10;
	 
	 float f = 24.4f;

	 void driving();
	
	 abstract void seats();
	 
	 default void hello()
	 {
		 
	 }
	 
	 private void hi()
	 {
		 
	 }
	
}



abstract class Bus implements Truck
{
	
    
	
	public void driving() {
		System.out.println("Driving");
	}

	
	public void seats() {
		return;
	}
	
	abstract void engine();
	
}

class Scooty extends Bus
{
	
	void engine()
	{
		return;
	}
}



public class Eleven_Interface {
      public static void main(String ... args)
      {
    	  Scooty s1 = new Scooty();
    	  s1.driving();
      }
}
















//
//Feature		                                     Abstract Class                                          Interface
//Methods		                                     Can have abstract + concrete methods                  Only abstract methods (before Java 8)
//Variables	                                         Can have instance variables                       	   Only public, static, final (constants)
//Constructor		                                 ✅ Can have a constructor                             ❌ No constructor
//Access Modifiers		                             Can use private, protected, etc.                      All methods are public by default



// All interfaces can be called abstract classes but all abstract classes can not be called interfaces.
// class - class - extends
//interface - class - implements
// class - interface - implements
// interface - interface - extends