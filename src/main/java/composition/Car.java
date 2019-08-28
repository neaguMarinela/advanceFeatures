package composition;

import java.util.Arrays;

public class Car {

    private Engine engine;
    private Tyre[] tyres;
    private Door[] doors;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", tyres=" + Arrays.toString(tyres) +
                ", doors=" + Arrays.toString(doors) +
                '}';
    }
}
