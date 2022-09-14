package Day_8_Scanners;

import java.util.Scanner;

public class Topic3_NextLine {
    public static void main(String[] args) {

        // 2 nextLine() this will read everything on the line and assign it to String:

        Scanner Fullname = new Scanner(System.in);
        System.out.println("please enter your full name");

        String name = Fullname.nextLine();

        System.out.println("The Fullname is  : " +name.charAt(0));




    }
}
