package Day_8_Scanners;

import java.util.Scanner;

public class Topic1_ScannerCont {
    public static void main(String[] args) {

        // we are creating a scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the short number");
        // how to scan the short data type input
        short sh = input.nextShort();
        System.out.println("the short number is :"+sh);

        System.out.println("please enter the the integer number");
        //next integer number entered by user
        int In = input.nextInt();

        System.out.println("the integer number is  : " +In);

        System.out.println("please enter the double number");

        //next double number entered by users

        double Do = input.nextDouble();

        System.out.println("this is the double number : "+Do);

        //next float number;
        System.out.println("please enter the float number");
        float fl = input.nextFloat();
        System.out.println("this is the float number : "+fl);





    }
}
