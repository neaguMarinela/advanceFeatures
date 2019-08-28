package arrays;

import java.util.Arrays;
import java.util.Collections;

public class Example1 {

    public static void main(String[] args) {

        String[] namesVar1 = {"Adam", "Kevin", "Joe", "Daniel", "Steven"};

        String[] namesVar2 = new String[3];
        namesVar2[0] = "Kevin";
        namesVar2[1] = "Joe";
        namesVar2[2] = "Adam";

        int[] numbers = {1, 5, 3, -2, 10, 8};

        for (int i = 0; i <= namesVar1.length - 1; i++) {
            System.out.println(namesVar1[i]);
        }

        Collections.sort(Arrays.asList(namesVar2));
        Arrays.sort(numbers);

        // for-each loop
        for (Integer s : numbers) {
            System.out.println(s);
        }

        int value = 7;

        int[] values;
        values = new int[3];

        System.out.println(values[0]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        int[] num = {5, 6, 7};

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }
}
