package modifiers;

public class App {

    /**
     * Access modifiers
     * <p>
     * 1.) no modifier(default modifier): visible to the package
     * 2.) private: visible to the class exclusively
     * 3.) public: visible to any class / "open to the world"
     * 4.) protected: visible to the package and all subclasses
     * <p>
     * Non-access modifiers
     * <p>
     * static -> these are the class variables
     * It can be accessed during the entire run of the program
     * "static memory allocation": static variables are allocated
     * in compile time !!!
     */

    public static void main(String[] args) {

        Student s = new Student(23);
        s.showAge();

        Constants c = new Constants();
        c.sayHello();

    }
}
