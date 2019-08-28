package composition;

public class App {

    /**
     * Composition: having an instance of another class as
     * a field variable instead of extending
     * <p>
     * Inheritance: IS-A relationship between the classes
     * Composition: HAS-A relationship
     * <p>
     * FAVOUR COMPOSITION OVER INHERITANCE !!!
     * Easier to build structures out of components so with
     * composition -> rather than trying to find the
     * commonality between them + construct a family tree !!!
     */

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car);

    }
}
