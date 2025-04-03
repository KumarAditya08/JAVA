package Experiments;

class Student_S
{
	String name,section;
	int rno;
	
	Student_S(String n,String s,int r)
	{
		name = n;
		section = s;
		rno = r;
		System.out.println("Name : "+name+"\nSection : "+section+"\nRoll Number : "+rno);
	}
	
	void update(String n,String s,int r)
	{
		name = n;
		section = s;
		rno = r;
		System.out.println("Name : "+name+"\nSection : "+section+"\nRoll Number : "+rno);
	}
	
	void delete()
	{
		this.name = null;
		this.section = null;
		this.rno = 0;
		System.out.println("Name : "+name+"\nSection : "+section+"\nRoll Number : "+rno);
	}
}

public class Exp_3 {
     public static void main(String args[])
     {
    	 Student_S s1 = new Student_S("Aditya","A1",59);
    	 s1.update("Dhruv", "A4", 32);
    	 s1.delete();
     }
}
