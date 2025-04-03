package OOPS;

public class One_1 {
	
	public static void fun(Student x)
	   {
	       System.out.println(x.name);
	       return;
	   }

	    public static void main(String args[])
	    {

	          
	    // creating a new data type
	    class Student{
	        String name;
	        int rno;
	        double percentage;

	    }                                  // Scope of this class is only inside main function


	          Student x = new Student(); // declaration
	          x.name = "Aditya";
	          x.rno = 59;
	          x.percentage = 60;

	          System.out.println(x.name);

	          Student s = new Student();
	          s.name = "Dhruv";
	          s.rno = 32;
	          s.percentage = 99;


	          fun(x);
	    }
}
