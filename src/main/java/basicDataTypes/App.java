package basicDataTypes;

public class App {

    /**
     * byte: 8 bit signed integer [-128,127]
     * <p>
     * short: 16 bit signed integer  [-32 768, 32 767]
     * <p>
     * int: 32 bit signed integer [-2 147 483 648, 2 147 483 647]
     * <p>
     * long: 64 bit signed integer
     * <p>
     * float: 32 bit floating point number
     * <p>
     * double: 64 bit floating point number
     * <p>
     * char: 16 bit unicode character
     * <p>
     * boolean: one bit of information (yes/no, 1/0)
     */

    public static void main(String[] args) {

        String s = "welcome";
        System.out.println(s);


        int myNumber = 88;
        short myShort = 847;
        long myLong = 9797;

        double myDouble = 7.3243;
        float myFloat = 324.3f;

        char myChar = 'y';
        boolean myBoolean = false;

        byte myByte = 127;


        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myByte);

    }
}
