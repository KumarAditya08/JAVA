package Variables;

public class Local {
      void show()
      {
    	  int a = 10;                   // Local Variable
    	  System.out.println(a);
      }
      
      
      public static void main(String args[])
      {
    	  Local l1 = new Local();
    	  l1.show();
//    	  System.out.println(a);    Error
      }
}

//
//
//1️ Local Variables
//👉 Definition: A variable declared inside a method, constructor, or block. It is created when the method is 
// called and destroyed when the method finishes execution.
//
//✅ Key Points:
//
//Scope: Limited to the method/block where it is declared.
//Access Modifier: Cannot have public, private, protected (only accessible within the method).
//Default Value: No default value (must be initialized before use).
//Memory: Stored in the stack memory.


