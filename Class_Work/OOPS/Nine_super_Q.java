package OOPS;



class Per
{
	int id;
	String name;
	
	Per(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}


class Emp extends Per
{
	float salary;
	Emp(int id,String name,float salary)
	{
		super(id,name);
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}
}


public class Nine_super_Q {
      public static void main(String args[])
      {
    	  Emp e1 = new Emp(1,"Aditya",45000f);
    	  e1.display();
      }
}
