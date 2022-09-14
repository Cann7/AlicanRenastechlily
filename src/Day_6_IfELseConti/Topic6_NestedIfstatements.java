package Day_6_IfELseConti;

public class Topic6_NestedIfstatements {
    public static void main(String[] args) {

        // nested if statements

        // if number is zero just print
        // if number is even and less than 50 double it
        // if number us odd and less than 70 trible

        int number = 72;

        if(number == 0){

            System.out.println("the number is : " +number);
        }
        else if((number & 2) ==0){
            if(number<50){
                number = number *2;
            }
            else{
               number = number *4;
            }
        }
        else{
            if(number<70){
                number = number*3;
            }
            else{
                number = number*6;
            }
        }

        System.out.println(number);



    }
}
