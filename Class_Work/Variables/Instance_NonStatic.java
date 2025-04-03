package Variables;

public class Instance_NonStatic {
       String name;
       int rno;
       
       void show()
       {
    	   System.out.println("Name : "+name+" Roll Number : "+rno);
       }
       
       public static void main(String args[])
       {
    	   Instance_NonStatic v1 = new Instance_NonStatic();
    	   v1.name = "Aditya";
    	   v1.rno = 59;
    	   
    	   v1.show();
    	   
       }
}



//
//2️ Instance Variables (Non-Static Variables)
//👉 Definition: A variable that belongs to an object and is declared inside a class but outside any method or constructor.
//
//✅ Key Points:
//
//Scope: Available across the class and belongs to an instance (object).
//Access Modifier: Can have public, private, protected, or default.
//Default Value: Gets default values (0 for int, null for objects, false for boolean).
//Memory: Stored in the heap memory (each object gets its copy).
