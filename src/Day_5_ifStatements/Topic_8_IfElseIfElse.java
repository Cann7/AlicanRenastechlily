package Day_5_ifStatements;

import java.awt.*;

public class Topic_8_IfElseIfElse {


    //100-90 will result a grade
    //89-80 will result b grade
    //79-70 will result c grade
    //69-60 will result d grade
    //59-50 will result f grade

    public static void main(String[] args) {

        int point = 20;

        if(point>=90){
            System.out.println("the grade is a");

        } else if(point>=80 && point<90){
            System.out.println("the grade is b");

            }
        else if(point>=70 && point<80){
            System.out.println("the grade is c");
        }

        else if(point>=60 && point<70){
            System.out.println("the grade is d");
        }
        else {
            System.out.println("the grade is f");
        }






    }


    }

