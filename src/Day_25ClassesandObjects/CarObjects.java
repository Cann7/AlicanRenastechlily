package Day_25ClassesandObjects;

import java.util.ArrayList;

public class CarObjects {
    public static void main(String[] args) {

        CarClass car1= new CarClass();
        car1.setStringValues("Toyota","Camry","Grey");
        car1.setYear(2020);
        car1.Miles=190.89;

        System.out.println("The Car Object::: "+car1.Print());

        System.out.println("The car model is : "+car1.Model);

        CarClass car2= new CarClass();
        car2.Brand= "Subaru";
        car2.Model="Impreza";
        car2.Year=2021;
        car2.Miles=200000.95;

        System.out.println("The second car is >>"+car2.Print());

       // System.out.println("the second car is : "+car2); if wrote this it will give us hashcode

        int [] numbers ={4,6,7};
        CarClass [] objc={car1,car2};
        System.out.println("The car1 model :" +objc[0].Model);



        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        int a= numbers[2];
        System.out.println("The value of a : "+a);

        CarClass obj1 = objc[0];
        System.out.println("______________________________________");
        System.out.println("The obj1 model : "+obj1.Model);

        /// With ArrayList

        ArrayList<CarClass> Objects =new ArrayList<>();
        Objects.add(car2);
        Objects.add(car1);

        CarClass obj2 = Objects.get(1);

        System.out.println("The Year id the obj2 : "+obj2.Year);




    }
}
