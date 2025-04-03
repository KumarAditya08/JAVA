package OOPS;


abstract class Vehicle
{
	Vehicle()
	{
		System.out.println("Hey Brother");
	}
	
	int wheels;

	abstract void driving();
	
	abstract void seats();
	
	void entertainment()
	{
		System.out.println("Awesome");
	}
	
	void show()
	{
		System.out.println("Stop");
	}
}



abstract class Car extends Vehicle
{
	
	Car()
	{
		System.out.println("Let us start");
	}
    
	@Override
	void driving() {
		System.out.println("Driving");
	}

	@Override
	void seats() {
		return;
	}
	
	abstract void engine();
	
}

class Bike extends Car
{
	
	void engine()
	{
		return;
	}
}




public class Ten_Abstract_1 {
       public static void main(String ... args)
       {
    	   Bike b1 = new Bike();
    	   b1.driving();
       }
}



//An abstract method is a method without a body (implementation). It is only declared in a parent class but must be implemented in child classes.
//
//📌 Key Rules of Abstract Methods

//1️ Declared using abstract keyword
//2️ Cannot have a body (no {})
//3️ Must be inside an abstract class
//4️ Child class must override it (or become abstract itself)



//If we have atleast one abstract method , then the whole class will become an abstract class


//If an abstract class has only abstract methods, it behaves like an interface but still remains an abstract class.


//If a class implements an abstract class then it has to implement all the abstract methods that are present. Example : Car