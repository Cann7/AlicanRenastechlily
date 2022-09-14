package Day_2variables;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EscapeSequence {

    public static void main(String[] args) {
        // \t  it is going to leave paragraph space on the console

        System.out.print("\tThis is a tab space \tthis is another one");
        System.out.print("this is a test \t");

        // \n It is going to move new line on the console
        System.out.print("\nNew line");
        System.out.print("Alican");
        // the top is equal to the next one
        System.out.print("Alican\n");

        //\" prints double quote " on the console
        System.out.print("\n This is \"ALICAN\"");

        //\\ prints \ on the console
        System.out.print("\n This is back slash \\");

        //\' prints single quote on the console
        System.out.print("\n This is \'\'ALICAN\'");



    }
}
