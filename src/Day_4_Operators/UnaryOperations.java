package Day_4_Operators;

public class UnaryOperations {

    public static void main(String[] args) {

        //Unary Plus :  (+) it does NOT have any effect on the number;

        int number = 10;
        number = +number;
        System.out.println(number);

        int number1 = -10;
        number1 = +number1;
        System.out.println(number1);

        // unary minus (-) // it will change the sign or the value to be opposite

        int number2 = -20;

        number2 = -number2;
        System.out.println(number2);

        int number3 = 30;
        number3 = -number3;
        System.out.println(number3);

        // increasement operator (++) /it increase the number by 1;

        int number4 = 8;
        number4++;     // number4 = number4 + 1;      if we do this this one is the longest way
        ++number4;

        System.out.println(number4);


        // decrement operators (--) it will decrease the number by 1 ;

        int number5 = 30;
        number5--;  // number5 = number5 - 1 ;
        System.out.println(number5);


        --number5;
        System.out.println(number5);

        //invert (!) it invert the boolean values. if its true it will false, if it is false it will invert to true

        boolean bool = true;
        bool = !bool;
        System.out.println(bool);






    }


}
