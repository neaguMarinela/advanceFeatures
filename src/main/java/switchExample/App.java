package switchExample;

public class App {

    public static void main(String[] args) {

        int numberOfCase = 1;

        switch (numberOfCase) {
            case 1:
                System.out.println("Hi Adam!");
                break;
            case 2:
                System.out.println("Hello Kevin!");
                break;
            default:
                System.out.println("I do not know your name");
                break;
        }

    }
}
