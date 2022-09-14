package Day_13WhileLoop;

import java.util.Scanner;

public class Topic3_WhileLoopExample {
    public static void main(String[] args) {

        // write a code where user can do multiple calculation without rerunning the code

        Scanner sc=new Scanner(System.in);

        System.out.println("******** Welcome to Calculator *********");
        System.out.println("Please select the operation 1: for Addition  2: for Subs 3: for Multi 4:  for Division any other number to exist");
        int i = sc.nextInt();

        while (i==1 || i==2 || i==3 || i==4){

            System.out.println("Please Enter the first number ");
            double num1=sc.nextDouble();
            System.out.println("Please Enter the second number");
            double num2=sc.nextDouble();
            if (i==1){
                double result = num1+num2;
                System.out.println("The result is : "+result);
            }
            else if (i==2){
                double result = num1-num2;
                System.out.println("The result is : "+result);
            }
            else if (i==3){
                double result = num1*num2;
                System.out.println("The result is : "+result);
            }
            else if (i==4){
                double result = num1/num2;
                System.out.println("The result is : "+result);
            }

            System.out.println("Please select the operation 1: for Addition  2: for Subs 3: for Multi 4:  for Division any other number to exist");
             i = sc.nextInt();
        }

        System.out.println("you exited the calculator");



    }
}
