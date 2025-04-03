package Main;

public class One {
	 // Standard main() method (Java program entry point)
    public static void main(String[] args) {
        System.out.println("Standard main method");
        
        // Calling overloaded main methods manually
        main(10);
        main("Hello");
    }

    // Overloaded main method with an int parameter
    public static void main(int a) {
        System.out.println("Overloaded main with int: " + a);
    }

    // Overloaded main method with a String parameter
    public static void main(String str) {
        System.out.println("Overloaded main with String: " + str);
    }
}

