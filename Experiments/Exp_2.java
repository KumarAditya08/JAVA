package Experiments;



class Student_s
{
	private String name,section;
	private int rno;
	
	Student_s(String n,String s, int r)
	{
		name = n;
		section = s;
		rno = r;
		
		System.out.println("Name : "+name+"\nSection : "+section+"\nRoll Number : "+rno);
		
	}
	
}

class Course_c
{
	private String c_name,c_id;
	
	Course_c(String n,String id)
	{
		c_name = n;
		c_id = id;
		System.out.println("Course Name : "+c_name+"\nCourse Id : "+c_id);
	}
}



public class Exp_2 {
    public static void main(String args[])
    {
    	Student_s s1 = new Student_s("Aditya","A1",59);
    	Course_c c1 = new Course_c("Java","COM-411");
    }
}
