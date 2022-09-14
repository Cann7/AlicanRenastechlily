package Day_6_IfELseConti;

public class Topic_2_Ternary {

    // write a code were it checks 2 numbers and assign the bigger to variable called max

    public static void main(String[] args) {
        int number1 = 89;
        int number2 = 50;
        int max;

        if(number1>number2){
            max= number1;
        }else max = number2;

        System.out.println("the max is : " +max);

        // ternary max = (number1>number2) ? number1:number2

        max = (number1>number2) ? number1 : number2;         //?  means if     ,,,  :  means else
        System.out.println("this the second line : " +max);


    }




}
