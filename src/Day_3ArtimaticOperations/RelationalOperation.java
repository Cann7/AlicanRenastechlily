package Day_3ArtimaticOperations;

import javax.jws.soap.SOAPBinding;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RelationalOperation {

    public static void main(String[] args) {
        int number = 10;

        //  1st logical expression
        // == the options are either true or false

        boolean B1 = 10 == 10;
        System.out.println(B1);

        boolean B2 = "Alican" == "alican";
        System.out.println(B2);

        //2nd >= checks 2 things and if it is greater or equal it will return true.
        boolean B3 = 12 >= 10;
        System.out.println(B3);
        boolean B4 = 12>=200;
        System.out.println(B4);
        System.out.println(10>=12);

        //3th  <= check 2 things and if it less or equal it returns as true , otherwise it is false

        boolean B5 = 14 <= 15;
        System.out.println(B5);
        boolean B6 = 17<=16;
        System.out.println(B6);

        //4th  != compares  things if they are NOT equal  it will return true, otherwise it will  be false

        boolean B7 = 14 != 14;
        System.out.println(B7);
        boolean B8 = 27 != 23;
        System.out.println(B8);

        //5th > compares 2 things if one is greater than the other it will be true, otherwise it will  be false

        boolean B9 = 14>15;
        boolean B10 = 30>20;

        //6th < compares 2 things if one is less than the other it will be true, otherwise it will  be false

        boolean B11 = 11 < 9000;
        boolean B12 = 900< 100;
        System.out.println(B11);
        System.out.println(B12);

        boolean B13 = !(true == false);
        System.out.println(B13);

        // ! it will convert false to true , true to false.

        boolean B14= !((true == false) == !(10<=11));
        System.out.println(B14);

        boolean B15 = !(('C'=='c') ==(13==14)== !(("er"=="ER")==(true==true)));
        System.out.println(B15);








    }

}
