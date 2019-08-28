package whileExample;

public class App {

    public static void main(String[] args) {

        int counter = 0;

        //infinite loop
		/*while(true) {
			System.out.println("While loop running " + counter);
			counter++;
		}*/

        //finite loop
        boolean flag = true;
        while (flag) {
            counter++;
            System.out.println("Counter value is: " + counter);
            flag = false;
        }

        //1....10
        int i = 1;   //initial value
        while (i <= 10) {
            System.out.println(i); //1 2 3 4 5 6 7 8 9 10
            i++; //sau  i=i+1  //increment values
        }


        //2,4,6,8,10  ---> even numbers
        int j = 2;
        while (j <= 10) {
            System.out.println(j); //2 4 6 8 10
            j = j + 2;

        }


        //1,3,5,7,9  ---> odd numbers
        int x = 1;
        while (x <= 10) {
            System.out.println(x); //1,3,5,7,9
            x = x + 2;

        }


        //10,9,8,7,6,5,4,3,2,1
        int y = 10;
        while (y > 0) {
            System.out.println(y); //10 9......1
            y--;

        }
    }
}
