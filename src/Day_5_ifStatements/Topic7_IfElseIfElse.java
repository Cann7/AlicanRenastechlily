package Day_5_ifStatements;

public class Topic7_IfElseIfElse {
    public static void main(String[] args) {

        /*

        if (condition){          // the system always checking first condition and then if its true for exapmle adn then system goes to chec second line
        }
        else if(anothercondition){
        }
        else if(anothercondition){
        }
        else{
        }

         */


        int gamenumber = 50;

        if (gamenumber>100){  // example our number is 50 thats why system didint read it

            System.out.println("correct");

        } else if (gamenumber<50) {     //and our number is not less then 50 thats why our system didint read it

            System.out.println("correct");


        }else{
            System.out.println("your number is : " +gamenumber);    //our system read it this line adn came out
        }


    }
}
