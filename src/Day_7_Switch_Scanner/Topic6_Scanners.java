package Day_7_Switch_Scanner;

import java.util.Scanner;

public class Topic6_Scanners {
    public static void main(String[] args) {
        // scanner is a library under java
        // this library has ready methods that you can use it
        // to be able to use this library we need to call them in our class
        // and create object from that library

        Scanner sc = new Scanner(System.in);          // when you wanna do scanners you have to always put scanner java until
        System.out.println("enter a number : ");
        byte byteNumber = sc.nextByte();
        System.out.println("the byteNumber is : " +byteNumber);


        System.out.println("enter a integer : ");
        int intValue = sc.nextInt();                                                             // byteNumber = 20;
        System.out.println("the bytrnumber is : " +intValue);                                         //System.out.println("the byteNumber is : " +byteNumber);

    }
}
