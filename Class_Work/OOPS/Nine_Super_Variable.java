package OOPS;


class Huge {
    int x = 10;
}

class Min extends Huge {
    int x = 20;                   // both will be 10 if this statement is not there

    void display() {
        System.out.println("Min x: " + x);     // Min's x                     
        System.out.println("Huge x: " + super.x); // Huge's x
    }
}



public class Nine_Super_Variable {
	public static void main(String[] args) {
        Min obj = new Min();
        obj.display();
}
}