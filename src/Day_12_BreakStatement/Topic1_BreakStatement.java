package Day_12_BreakStatement;

public class Topic1_BreakStatement {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            // sPoint    ePoint inc
            System.out.println("Hello Hello");

            if (i == 5) {
                System.out.println("Hello World!");
            }

        }

        System.out.println("**************");

        // Break Statement

        //break statement
        //anytime java will reach to break statement it will stop current condition that you have
        //if java cathcs break inside the loop
        //loop will be stopped from running
        //anything after break statement wont be excuted


        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello ");
            System.out.println(i);

            if (i == 5) {
                break;
            }
        }

        for (int speed = 0; speed < 300; speed++) {
            System.out.println("speed " + speed);

            if (speed == 75) { // if java catches the condition it will stop the loop
                break;
            }

        }

        System.out.println("**************");

        for (int i = 1; i < 9; i++) {
            //i=1
            //i=2
            //i=3
            //i=4
            //i=5
            //i=6

            System.out.println(i);

            //i=2 true && false
            //i=6 true && true
            if (i % 2 == 0 && i % 3 == 0) {
                break;

            }

        }
        System.out.println("********************");
        for (int i = 9; i >= 0; i--) {
            //i=5


            if (i % 5 == 0) { // 10 %5 ==0
                break;
            }

            System.out.println(i);

        }

        System.out.println("***************");
        for (int k = 0; k <10 ; k+=2) {
            // k=0       0<10   0+2
            //k=2        2<10   2+2
            //k=4        4<10    4+2



            if ( k==4){ // 4==4
                break;
            }

            System.out.println(k);

        }



        System.out.println("Hello");



    }
}
