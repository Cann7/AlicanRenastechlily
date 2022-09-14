package MyUtil;

public class StaticTestClass {

    public static int num=30;
    public static String Name = "Cenkay";
    public int num2 =25;      // not static variables keep in mind
    public String Name2 = "Bulent";  // not static variables

    public static void PrintStatic(){
        System.out.println("This is from Static method");
    }

    public void Print(){
        System.out.println("This is from non-static method");
    }


}
