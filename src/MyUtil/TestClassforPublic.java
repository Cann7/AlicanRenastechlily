package MyUtil;

public class TestClassforPublic {

    public static void FromDiffClass(String Fname,String Lname ){

        System.out.println("The first name is : " +Fname+" "+"The last name is : "+Lname);
    }

    public static double Sum(double num1, double num2){
        double SUM= num1+num2;
        return SUM;  // (double) num1+num2;
    }

     static void PMethod(){

        System.out.println("This is private method ");
    }
}
