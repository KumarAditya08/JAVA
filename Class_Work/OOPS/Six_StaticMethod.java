package OOPS;

public class Six_StaticMethod {
       int x = 10;
       
       static void static_method()
       {
    	   System.out.println("This is static method");
       }
       
       void Non_static_method()
       {
    	   System.out.println("NonStatic Method x = "+x);
       }
       
       public static void main(String args[])
       {
    	   Six_StaticMethod.static_method();
    	   
    	   Six_StaticMethod s1 = new Six_StaticMethod();
    	   
    	   s1.Non_static_method();
       }
}



//Conclusion

//Feature	                                           Static Method	                           Non-Static Method
//Belongs To		                                    Class                                       Object
//Accessed By		                                  	ClassName.methodName()                      objectName.methodName()
//Memory Location		                                Method Area                                 Heap (in object)
//Can Access Instance Variables?	                    ❌ No	                                    ✅ Yes
//Can Use this?	                                        ❌ No	                                    ✅ Yes
//Can Be Overridden?	                                ❌ No (only hidden)	                        ✅ Yes