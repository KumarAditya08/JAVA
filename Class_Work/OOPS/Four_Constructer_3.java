package OOPS;

public class Four_Constructer_3 {
    Four_Constructer_3()
    {
        System.out.println("This is default constructer");
    }

    Four_Constructer_3(int a)
    {
        System.out.println("This is single parameterize constructer");
    }

    Four_Constructer_3(int a,int b)
    {
        System.out.println("This is double parameterize constructer");
    }

    Four_Constructer_3(float  a,int b)
    {
        System.out.println("This is double parameterize constructer");
    }

    Four_Constructer_3(int a,float b)
    {
        System.out.println("This is double parameterize constructer");
    }


    public static void main(String[] args) {
        Four_Constructer_3 s_1 = new Four_Constructer_3();
        Four_Constructer_3 s_2 = new Four_Constructer_3(12);
        Four_Constructer_3 s_3 = new Four_Constructer_3(12,23);
        Four_Constructer_3 s_4 = new Four_Constructer_3(4,4.56f);
        Four_Constructer_3 s_5 = new Four_Constructer_3(23.45f,56);
    }
}





//we have multiple constructer in a single class , therefore it is called as constructer overloading

//type, number and order of argument must be different