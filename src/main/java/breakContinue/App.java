package breakContinue;

public class App {

    /**
     * break: breaks out of the loop so leaves the loop
     * continue: jumps to the next iteration
     */

    public static void main(String[] args) {

        int[] nums = {1, 5, 3, 7, 8, 9, 2};

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 8) {
                continue;
            }
			/*if( nums[i] == 8 ) {
				break;
			}*/

            System.out.println(nums[i]);
        }

        //---------------------------

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i); //1 2 3 4
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 7 || i == 9) {
                continue;
            }
            System.out.println(i); //1,2,3,4,6,7,8,9,10
        }
    }
}
