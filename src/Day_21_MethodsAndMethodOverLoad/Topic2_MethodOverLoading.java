package Day_21_MethodsAndMethodOverLoad;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Topic2_MethodOverLoading {

    // Method OverLoading is where we use the method to handle same action with multiple/different inputs.

    public static void NAME(String fname){
        System.out.println("The first name is : "+fname);
    }
    public static void NAME(String FName,String LName){
        System.out.println("The first name  : "+FName+" Last Name :"+LName);
    }

    public static String NAME(String Fname, String LName, int age){
        return "The first name is : "+Fname+ "The last name : "+LName+ "Age is : " +age;
    }

    public static void main(String[] args) {
        NAME("Ziya");
        NAME("ZIYA", "YILMAZ");
        //NameFandLast("ziya","yilmaz");

        System.out.println(NAME("ZIYA " ,"YILMAZ",32));

    }

}
