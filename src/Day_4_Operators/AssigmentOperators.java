package Day_4_Operators;

public class AssigmentOperators {

    public static void main(String[] args) {

        int box = 10;
        box = 15; // do not need to specify the data type again
        box = box+10; // the first box is empty for now, the second has the value of previous.
                         //new box value will be assigned

        box+=10; // it is equal to box = box + 10
        System.out.println(box);

        int box1 = 20;
        box1 = box1 - 10;

        box1 -=10;    // it is equal to box1 = box1-10;

        System.out.println(box1);

        int num1 = 20;
        num1 %= 3;
        System.out.println(num1);




    }

}
