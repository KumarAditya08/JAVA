package Variables;

public class Static_Class {
       int empId;    // Instance variable
       static String company = "TechCorp";   // Static variable
       
       void show()
       {
    	   System.out.println("Emp Id : "+empId+" Comapny : "+company);
       }
       
       public static void main(String args[])
       {
    	   Static_Class e1 = new Static_Class();
    	   
    	   e1.empId = 59;
    	   e1.show();
    	   
    	   Static_Class e2 = new Static_Class();
    	   e2.empId = 32;
    	   e2.show();
    	   
    	   Static_Class.company = "ABC";
    	   e1.show();
    	   e2.show();
       }
}



//3️ Static Variables (Class Variables)
//👉 Definition: A variable that is declared with the static keyword. It belongs to the class rather than an object,
//   meaning all objects share the same copy.
//
//✅ Key Points:
//
//Scope: Shared among all instances of the class.
//Access Modifier: Can have public, private, protected, or default.
//Default Value: Gets default values like instance variables.
//Memory: Stored in the method area (class memory).