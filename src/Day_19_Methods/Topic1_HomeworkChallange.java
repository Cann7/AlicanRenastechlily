package Day_19_Methods;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Topic1_HomeworkChallange {
    public static void main(String[] args) {

       /** Please see the instruction below for the Assignment
        * Write a code where it calculates the shortest distance from the starting point to the ending point
        1) User is entering the number of miles.
        2) Then the user enters the direction (“W” or “w”  for the west, “N” or “n” for North, “E” or “e” for East, “S” or “s” for South,
                (enter the number of the miles: 2)
        (Enter the direction: W)
        3) This will continue until the user is done entering the miles and directions(Check out the previous example: for instance “If you are done please enter 0”)
        4) Find the shortest distance between Starting Point and the End Point with the direction, ( Hint: The hypotenuse theory, To find the square root of a number, you can use Math.sqrt(number) see the example on  the screenshot below)
        5) See the example below.
        6) Based on the Screenshot provided your output or answer should be  ( The Answer is: 4.472213 Miles NorthEast)
        7) If the endpoint and starting point are the same your output or the answer should be (The Answer is: You are at the Starting Point)
        8) You are only allowed to you the topics we have covered so far except Math.sqrt() // which is a Math method returns to the Square root of a number
        9) Please do it yourself. Do NOT as your developer or QA engineer friends. Be fair to everyone in the class. Ask on the Comments if you have any questions about the assignment (edited)
**/

       int N = 0;
       int E = 0;
       int W = 0;
       int S = 0;

       String SN ="";
       String WE ="";
       Scanner scan=new Scanner(System.in);

        System.out.println("please enter the distance or enter 0 to quit : " );
        int distance = scan.nextInt();

        while(distance !=0){

            System.out.println("please enter Direction : for East enter e for West w for South s and for North n " );
            String direction = scan.next();

            if (direction.equalsIgnoreCase("e")){
                E =E +distance;

            } else if (direction.equalsIgnoreCase("w")) {
                W=W+distance;
            } else if (direction.equalsIgnoreCase("s")) {
                S=S+distance;
            }else {
                N=N+distance;
            }
            System.out.println("please enter the distance or enter 0 to quit : " );
            distance = scan.nextInt();

        }

        int south =S-N;
        int east =E-W;

        double midcal=(double) ((south*south)+(east*east));
        double shr=Math.sqrt(midcal);

        if (south<0){
            SN="north";

        }else if (south>0){
            SN="south";
        }else {
            SN="";
        }

        if (east<0){
            WE="west";
        } else if (east>0) {
            WE="east";
        }else {
            WE="";
        }

        System.out.println("The shortest Distance is : "+shr+" and the Direction is : "+SN+WE);


    }

}
