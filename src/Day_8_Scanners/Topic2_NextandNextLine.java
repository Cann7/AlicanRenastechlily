package Day_8_Scanners;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Topic2_NextandNextLine {
    public static void main(String[] args) {

        // the strings have 2 ways to be scanned
        // 1) next()  code will read all the inputs that can be number or chars, or anything you put in the conse
        //until it sees a space " ";
        // 2) nextLine()
        Scanner st = new Scanner(System.in);

        System.out.println("put something on the console");

        String fruit = st.next();  //we dont need the defined this bcz string is not primitive things

        System.out.println("the thing you put is : "+fruit);

        /*System.out.println("enter something with space : ");
        String Butter = st.nextLine();
        System.out.println("the thing you entered is  : " +Butter);
        String name = ""; */

        System.out.println("put veggies on thr console");
        String vegges = st.next();

        System.out.println("the things you put is  : "+vegges);   //the system first read when we write to the apple first reading apple at the bottom a
        // dn then it reads tomatoes and give us result i mean when we write side by side

    }
}
