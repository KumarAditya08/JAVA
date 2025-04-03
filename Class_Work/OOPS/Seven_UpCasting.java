package OOPS;


class P
{
	void Print()
	{
		System.out.println("This is P Class");
	}
}

class subclass1 extends P
{
	void Print()
	{
		System.out.println("This is Sub Class 1");
	}
}



class subclass2 extends P
{
	void Print()
	{
		System.out.println("This is Sub Class 2");
	}
}




public class Seven_UpCasting {
	
      public static void main(String args[])
      {
//    	  P p = new subclass1();
//    	  P p = new subclass2();   Error 
          
    	  P p;
    	  p = new subclass1();
    	  
    	  p.Print();
    	  
    	  p = new subclass2();

          p.Print();
      }
}

// Up casting - Parent holding child
