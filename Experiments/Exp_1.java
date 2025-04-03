package Experiments;

class Student
{
	String name,section;
	int rno;
	
	Student(String n,String s, int r)
	{
		name = n;
		section = s;
		rno = r;
		
		System.out.println("Name : "+name+"\nSection : "+section+"\nRoll Number : "+rno);
		
	}
	
}

class Course
{
	String c_name,c_id;
	
	Course(String n,String id)
	{
		c_name = n;
		c_id = id;
		System.out.println("Course Name : "+c_name+"\nCourse Id : "+c_id);
	}
}



public class Exp_1 {
    public static void main(String args[])
    {
    	Student s1 = new Student("Aditya","A1",59);
    	Course c1 = new Course("Java","COM-411");
    }
}
