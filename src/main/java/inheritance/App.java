package inheritance;

public class App {

    /**
     * Inheritance -> when a given class acquires the properties
     * of another class
     * // methods and variables ...
     * <p>
     * Class that inherits: subclass / derived class / child class
     * Class whose properties are inherited: superclass / parent class
     * <p>
     * super keyword -> with this keyword we can call the parent class
     * For example: same method name in both classes we can
     * differentiate the members with super
     * <p>
     * INHERITANCE MEANS IS-A RELATIONSHIP !!!
     */

    public static void main(String[] args) {

        Student s = new Student(26, "Kevin", "MIT");
        s.showAge();

    }
}
