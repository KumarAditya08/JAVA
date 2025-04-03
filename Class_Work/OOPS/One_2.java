package OOPS;

public class One_2 {

	 public static class Student
	    {
	        String name;
	        int rno;
	        double percentage;
	    }                          // Now everything is fine

	    public static void fun(Student x)
	    {
	        System.out.println(x.name);
	        return;
	    }

	    public static void change(Student x)
	    {
	        x.name = "Adii";
	        return;
	    }                           // Also passed by reference
	    
	    public static void main(String args[])
	    {
	        Student s1 = new Student();
	        s1.name = "Aditya";
	        s1.rno = 59;
	        s1.percentage = 67.5;

	        fun(s1);
	        
	        System.out.println(s1.name);
	        change(s1);
	        System.out.println(s1.name);
	    }
}
