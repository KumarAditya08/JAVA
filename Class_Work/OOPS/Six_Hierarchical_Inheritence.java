package OOPS;

class M {
    void show() {
        System.out.println("Parent class");
    }
}

class Child1 extends M {
    void display1() {
        System.out.println("Child 1 class");
    }
}

class Child2 extends M {
    void display2() {
        System.out.println("Child 2 class");
    }
}


public class Six_Hierarchical_Inheritence {
	 public static void main(String[] args) {
	        Child1 obj1 = new Child1();
	        obj1.show();
	        obj1.display1();

	        Child2 obj2 = new Child2();
	        obj2.show();
	        obj2.display2();
	    }
}
