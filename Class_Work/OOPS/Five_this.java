package OOPS;

public class Five_this {
      String name;
      int rno;
      
      Five_this(String name, int rno)
      {
    	  this.name  = name;
    	  this.rno = rno;
      }
      
      public static void main(String args[])
      {
    	  Five_this s1 = new Five_this("Aditya",59);
    	  System.out.println(s1.name+" "+s1.rno);
      }
}


