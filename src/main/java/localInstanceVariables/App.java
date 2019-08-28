package localInstanceVariables;

public class App {

    /**
     * LOCAL variables:
     * <p>
     * - these variables are declared in methods or constructors
     * - these variables are created when the method or constructor is called
     * and they are destroyed once the program returns from the given method
     * or constructor
     * <p>
     * - we can't use access modifiers
     * - they are stored on the stack memory: so quite fast to access
     * them
     * <p>
     * - there is no default values for local variables so we have to
     * initialize them before we could use them
     * <p>
     * INSTANCE variables:
     * <p>
     * - declared in class but outside the methods or constructors
     * - so they belong to the object -> they are stored in the heap memory
     * - they are created when we instantiate a class with 'new'
     * - we can use access modifiers
     * - inside the class these variables are visible for methods ...
     * - instance variables have default values !!!
     * <p>
     * GLOBAL variables: the static variables
     * <p>
     * - there will be one copy no matter how many objects are created
     * - they are created when the application starts + destroyed when
     * application stops
     */

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setAge(10);
        s1.calculate();

        float a = 1;
        float b = 3;

        System.out.println(a / b);
    }
}
