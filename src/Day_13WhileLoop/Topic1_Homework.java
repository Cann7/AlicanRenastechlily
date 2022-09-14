package Day_13WhileLoop;

import java.util.Scanner;

public class Topic1_Homework {
    /*
    - Write a code where user is asked to enter a number
    - Print the even sum of the even numbers from 0 to entered number(included) but the Sum should not pass 390
     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = sc.nextInt();
        int sum =0;

        for (int i = 0; i <=num ; i+=2) {

            if (sum+i<=390){
                sum = sum+i;
            }else {
                break;
            }
        }
        System.out.println("the result : "+sum);

    }

}
