package Day_13WhileLoop;

import java.util.Scanner;

public class Topic4_WhileLoopContEx {
    public static void main(String[] args) {

        // Same example with the previous one but using while(true)

        Scanner rd=new Scanner(System.in);
        System.out.println("******** Welcome to Calculator *********");
        System.out.println("Please select the operation 1: for Addition  2: for Subs 3: for Multi 4:  for Division any other number to exist");
        int con=rd.nextInt();

        while(true){
            if (con ==1){
                System.out.println("please enter the first number : ");
                double num1=rd.nextDouble();
                System.out.println("please enter the second number");
                double num2= rd.nextDouble();
                System.out.println("the result is : " +(num1+num2));
            }
            else if (con ==2) {
                System.out.println("please enter the first number : ");
                double num1 = rd.nextDouble();
                System.out.println("please enter the second number");
                double num2 = rd.nextDouble();
                System.out.println("the result is : " + (num1 - num2));
            }
            else if (con ==3) {
                System.out.println("please enter the first number : ");
                double num1 = rd.nextDouble();
                System.out.println("please enter the second number");
                double num2 = rd.nextDouble();
                System.out.println("the result is : " + (num1 * num2));
            }
           else if (con ==4) {
                System.out.println("please enter the first number : ");
                double num1 = rd.nextDouble();
                System.out.println("please enter the second number");
                double num2 = rd.nextDouble();
                System.out.println("the result is : " + (num1 / num2));
            }
           else {
               break;
            }
            System.out.println("Please select the operation 1: for Addition  2: for Subs 3: for Multi 4:  for Division any other number to exist");
            con=rd.nextInt();

        }
        System.out.println("you exited the calculator");







    }
}
