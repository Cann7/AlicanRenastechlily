package Day_6_IfELseConti;

public class Topic4_MultipleTernary {
    public static void main(String[] args){
        // number is 0 just say zero
        // if is even just say even
        // or if it is just say it is odd

        int num = 0;
        String result;
/*
        if(num == 0){

            result = "zero";

        }
        else if(num % 2 == 0){
            result = "even";

        }
        else result = "odd";
*/
        result = (num == 0) ? "zero" : (num % 2 == 0) ? "even": "odd";

        System.out.println("the number is : " + result);


    }
}
