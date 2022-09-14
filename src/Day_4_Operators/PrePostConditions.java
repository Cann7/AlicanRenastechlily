package Day_4_Operators;

public class PrePostConditions {

    public static void main(String[] args) {

        // after ++

        int num = 10;
        System.out.println(num++);  //num = num + 1;                           // first of all system sees num and then its gonna be increase !!!
        System.out.println(num);
        num++;
        System.out.println(num);

        //before ++ and your variables;

        int num1 = 10;
        System.out.println(++num1);
        System.out.println(num1);

        // num++ this num value will not increase immediately
        // ++num this num value will increase right the way

        // after -- (variables--)

        int num2 = 20;
        System.out.println(num2--);
        System.out.println(num2);

        int num3= 15;
        System.out.println(--num3);


    }

}
