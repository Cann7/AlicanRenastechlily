package Day_32_Polymorhism.CompileTimePoly;

public class MultiClass {

    public double Multiplication(double a, double b){
        return (a*b);
    }
    public double Multiplication(double q,double u,double v){ // method overloading is Compile time polymorphism
        return (q*u*v);
    }
    public void Multiplication(double q,double u,double v,String name){ // method overloading is Compile time polymorphism
        System.out.println("This is the result :");
    }
}
