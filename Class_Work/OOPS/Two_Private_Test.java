package OOPS;

public class Two_Private_Test {
    public static void main(String args[])
    {
    	Two_Private p1 = new Two_Private();
    	p1.name = "Aditya";
    	p1.percentage = 92.56;
    	p1.rno = 59;           // error because private attribute
    }
}
