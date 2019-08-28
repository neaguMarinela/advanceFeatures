package thisExample;

public class ThisKeyword {

    int a, b;  //class variables/instance variables/global variables

    ThisKeyword(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add(int a, int b)//method variables/external variables
    {
        int c = 10;
        this.a = a;
        this.b = b;

        System.out.println("Sum a, b and c: " + (a + b + c));
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println("Sum of a & b is:" + (a + b));
    }

    public static void main(String[] args) {

        ThisKeyword th = new ThisKeyword(10, 20);
        th.add(10, 20);
        th.display();


    }

}
