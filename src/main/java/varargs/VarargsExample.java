package varargs;

public class VarargsExample {
    public static void main(String[] args) {

        System.out.println(sum(1, 2, 3, 4)); // 10
        System.out.println(sum(1)); // 1
        System.out.println(sum()); // 0
    }

    static int sum(int... elements) {
        int result = 0;
        for (int i : elements) {
            result += i;
        }
        return result;
    }
}
