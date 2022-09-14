package Day_7_Switch_Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Topic4_SwitchStatments {


        // the it works is similar to the if statements
        // if we have a lot conditions to check,
        /*
        variable name

        switch(name){

        case alican :
              break;
        case ziya :
        :
        :
        :
        default: fdfhdj
        }
         */
        public static void main(String[] args) {

            int number = 12;
            String month ="";
            switch (number){ // where I put my variables;

                case 1 :month = "jan";
                    break;

                case 2 : month ="feb";
                break;

                case 3 : month="march";
                break;

                case 4 : month ="april";
                break;

                case 5 : month = "may";
                break;

                case 6 : month = "june";
                break;

                case 7 : month = "july";
                break;

                case 8 :  month ="aug";
                break;

                case 9 : month = "septe";
                break;

                case 10 : month = "octo";
                break;

                case 11: month = "nov";
                break;

                case 12: month ="dece";
                break;

                default: month = "invalid month";


            }

            System.out.println("the month in the year is : "+month);

    }
}
