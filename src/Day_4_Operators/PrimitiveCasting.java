package Day_4_Operators;

public class PrimitiveCasting {
    public static void main(String[] args) {

        // casting from smaller size to bigger size is not an issue, but going to from bigger size to smaller we have
        // specify
        //0101010101010010 = 300; 100, 1,2,3,4,5,6,7,8,9,10

        int A = 300;
        byte B = (byte) A;
        System.out.println(B);


        byte number1 = 100;
        int number2 = number1;
        System.out.println(number2);

        byte number3 = (byte) number2;
        System.out.println(number3);

        int number5 = 4376838;
        long number6 = number5;

        long number7 = 837982498l;
        int number8 = (int) number7;

        float number9 = 89.9f;
        double number10 = number9;

        int numberint = 3938393;
        float numberfloat = (float) numberint;
        System.out.println(numberfloat);



    }





}


