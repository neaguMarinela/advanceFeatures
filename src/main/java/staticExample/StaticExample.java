package staticExample;

public class StaticExample {

    static int a = 10;  //static variable
    int b = 20; //non static variable

    static void m1()   //static method
    {
        System.out.println("this is m1 static method");
    }


    void m2() //Non static method
    {
        System.out.println("this is m2 Non-static method");
    }

    void m3() //Non static
    {
        System.out.println("--------output from m3--------------");
        System.out.println(a);//static
        System.out.println(b); //non static
        m1(); //static
        m2(); //non static

    }


    public static void main(String[] args) {
        //1) static methods can access only static stuff(static variables & static methods)

        System.out.println(a);
        m1();

        //System.out.println(b); //incorrect, b is non-static variable
        //m2();// incorrect, m2() is non-static method

        //2) static methods can also access non-static stuff but through object.

        StaticExample se = new StaticExample();
        System.out.println(se.b);
        se.m2();
        se.m3();

    }

}
