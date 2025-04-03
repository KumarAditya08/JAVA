package OOPS;

public class Six_Static {
       String name;
       int rno;
       static int NoOfStudents;
       
       Six_Static(String name,int rno)
       {
    	   this.name = name;
    	   this.rno = rno;
    	   NoOfStudents++;
       }
       
       public static void main(String args[])
       {
    	   Six_Static s1 = new Six_Static("Aditya",59);
    	   Six_Static s2 = new Six_Static("Dhruv",32);
    	   System.out.println(Six_Static.NoOfStudents);
    	   System.out.println(s2.NoOfStudents);
       }
}
