package interfaces;

public class App {

    /**
     * Similar to a class: a collection of abstract methods
     * A class can 'implements' an interface
     * ~ inheriting the methods of the interface
     * <p>
     * CONTAINS BEHAVIOR OF A CLASS
     * <p>
     * - it can have as many methods as we want
     * - no implementation
     * - we can not instantiate an interface
     * <p>
     * Why is it good?
     * Because a class can extends a single class
     * BUT can implements several interfaces
     */

    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.move();
        dog.eat();

        Animal cat = new Cat();
        cat.eat();
        cat.move();

    }
}
