package Day_5_ifStatements;

public class Topic2_Ifstatement {

    public static void main(String[] args) {

        // If is a condition where it decides if the code block should run or  not
        /*
        if(condition "true"){
        hello
        go this way
        so on
        }

         */

        String name = "Class, this is the code block";
        int var1 = 10;

        if(var1 == 10){
            System.out.println(name);

        }

        System.out.println("this is outside of if statement");

        if(10>11){
            System.out.println("thi is none sense");
        }

        String name1= "Ziya";

        if (name1 == "Alican"){  //it didnt read bcz ziya is not =  to alican
            System.out.println(name1);
        }

        int a = 10;

        if (++a == 11){
            System.out.println("a is 11");
        }
        if(a == 11){
            System.out.println("this is the second line");
        }


    }
}
