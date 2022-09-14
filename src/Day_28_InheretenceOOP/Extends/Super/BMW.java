package Day_28_InheretenceOOP.Extends.Super;

public class BMW extends Car{  // THIS IS CHILD CLASS

    public double engineSize;

    // when we extend from car class we need the set-up those values public Car(String model,String make,int year){
    //        this.Model =model;
    //        this.Make =make;
    //        this.Year =year;
    //    }

    public BMW(String make,String mdl,int yr,double size){
                                 // when we create the super class it means it brings to the
                                 // all values from car class to here it's passing to here and there was no size values thats why we created size specifically
        super(mdl,make,yr);  // This is calling the Super Class Constructor (chaninning) and setting the values
        this.engineSize=size;
    }

    public void Fly(){
        super.Speed();
        System.out.println("It also Fly");
    }
    public void Print(){
        String s =super.display();

        s = s+" The Engine size  : "+engineSize;

        System.out.println(s);
    }



}
