package Day_11_ForLoops;

import java.util.Scanner;

public class Topic4_ForLoopExample2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Scanner from user input

        System.out.println("Please enter a String : ");
        String fromScan= scan.next();

        for (int i = 0; i < fromScan.length(); i++) {

            if (fromScan.charAt(i)=='A' || fromScan.charAt(i)== 'a' ){  // if the string contains A,
                fromScan = fromScan.toUpperCase();  // Then make all to upper case,
                System.out.println(fromScan);

            }else {
                fromScan = fromScan.toLowerCase(); // make it lower case
                System.out.println(fromScan); // print lo

            }

        }
        System.out.println(fromScan); // the last value of the fromscan
        // the last char is deciding last value of fromscan string to be either upper or lower case,

    }
}
