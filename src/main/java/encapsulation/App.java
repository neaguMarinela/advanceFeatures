package encapsulation;

public class App {

    /**
     * OOP concepts: inheritance, polymorphism, abstraction, encapsulation
     * <p>
     * - wrapping the data / variables / methods into a single unit (object)
     * - these will be hidden from other classes
     * ~ OK, they can be accessed by methods
     * <p>
     * "DATA HIDING"
     */

    public static void main(String[] args) {

        Student s = new Student();
        s.setAge(25);
        s.setName("Kevin");
        s.setUniversity("MIT");

        System.out.println(s);

    }
}
