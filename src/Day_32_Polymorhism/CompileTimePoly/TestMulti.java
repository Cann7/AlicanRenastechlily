package Day_32_Polymorhism.CompileTimePoly;

public class TestMulti {
    public static void main(String[] args) {
        MultiClass ml = new MultiClass();
        double result =ml.Multiplication(78,90);
        System.out.println("The result is : "+result);
        double result2 =ml.Multiplication(90,87,80);  // achieved Compile time polymorphism
        System.out.println("The result is : "+result2);
        ml.Multiplication(90,87,80,"Ziya");
    }
}
