package basicOperations;

public class App {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        //Arithmetic operators   + - * / %

        System.out.println("Sum of a and b is:" + (a + b));
        System.out.println("Diff of a and b is:" + (b - a));  //10
        System.out.println("Mul of a and b is:" + (a * b));
        System.out.println("Div of a and b is:" + (a / b)); // quotient
        System.out.println("Mod Div of a and b is:" + (a % b)); // reminder

        //Relational operators/comparison operators - always return a boolean value(true/false)
        // >  >=  <  <=  !=  ==

        System.out.println(a > b); //false
        System.out.println(b > a); //true
        System.out.println(a != b); //true
        System.out.println(a < b); //true
        System.out.println(a > b); //false
        System.out.println(a <= b); //true
        System.out.println(a >= b); //false

        //Logical operators && || ! -- returns true/false

        boolean x = true;
        boolean y = false;

        System.out.println(x && y); //false
        System.out.println(x || y); //true
        System.out.println(!x);//false


        a = 100;
        //int res=a++;   // post increment
        //int res=++a;  //pre increment

        //System.out.println(res);

        System.out.println(a++); //100   101
        System.out.println(++a); //102


        b = 100;

        //int res=b--;

        int res = --b;
        System.out.println(res);

        System.out.println("abc" instanceof String);

    }
}
