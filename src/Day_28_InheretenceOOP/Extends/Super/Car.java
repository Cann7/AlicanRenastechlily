package Day_28_InheretenceOOP.Extends.Super;

public class Car { // THIS IS PARENT CLASS

    // those are 3 car instance variable

    public String Model;
    public String Make;
    public int Year;

    public Car(String model,String make,int year){
        this.Model =model;
        this.Make =make;
        this.Year =year;
    }
// 2 method defined here
    public void Drive(){
        System.out.println(Model+ "  Drives");
    }
    public void Speed(){
        System.out.println(Model+ "  speed up");
    }

    public String display(){
       return "Model : "+Model + " Make : " +Make+  " Year : "+ Year;
    }

}
