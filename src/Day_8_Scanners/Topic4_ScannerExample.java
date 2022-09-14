package Day_8_Scanners;


import java.util.Scanner;

public class Topic4_ScannerExample {
    public static void main(String[] args) {

        //Lets create a calculator
        //Lets ask user to enter first number
        // Then ask user to enter second number
        // Select the operation

        Scanner cal = new Scanner(System.in);

        System.out.println("WELCOME TO CALCULATOR");

        System.out.println("please enter the first number : ");
        // asking user  first number
        double firstnumber = cal.nextDouble();

        System.out.println("please enter second number : ");
        double secondnumber = cal.nextDouble();

        System.out.println("1) select 1 for multiplication \n2) select 2 for division \n3) select 3 for addition\n4) select 4 for subtraction\n5) select 5 for mod");
        int operation = cal.nextInt();

        switch (operation){

            case 1 :
                double result = firstnumber*secondnumber;
                System.out.println("the result is : "+result);
                break;

            case 2 :
                double result2 =firstnumber/secondnumber;
                System.out.println("the result is : " +result2);
                break;

            case 3 :
                double result3 = firstnumber+secondnumber;
                System.out.println("the result is : "+result3);
                break;

            case 4 :
                double result4 =firstnumber-secondnumber;
                System.out.println("the result is : "+result4);
                break;
            case 5:
                double result5 = firstnumber%secondnumber;
                System.out.println("the result is : "+result5);
                break;
            default:
                System.out.println("the operations is not valid");



        }


    }
}
