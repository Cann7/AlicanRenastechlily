package Day_6_IfELseConti;

public class Topic3_TernarnyExample {
    public static void main(String[] args) {
        // check the number if is even or odd

        int num = 89;
        String result;

       /*
        if(num % 2 == 0){

            result = "even";

        }
        else result = "odd";

        System.out.println("the number is  : " + result);
        */

        result = (num % 2 == 0) ? "even" : "odd";
        System.out.println("the number is  : " +result);


    }
}
