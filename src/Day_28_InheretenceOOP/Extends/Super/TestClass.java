package Day_28_InheretenceOOP.Extends.Super;

public class TestClass {

    public static void main(String[] args) {
       //  Car car1=new Car();  for exap. we can't leave it like that bcz we defined in the car as a mode,make ,year  we need to put also here
        Car car1=new Car("I8","BMW",2019);

        car1.display();
        car1.Drive();
        car1.Speed();
        System.out.println("******************************");

        BMW bm1=new BMW("BMW","M4",2022,4.2); // WE ARE CALLING THIS FROM BMW CLASS   // public BMW(String make,String mdl,int yr,double size)//
        //bm1.display();
        bm1.Drive();
        bm1.Speed();
        bm1.Fly();
        bm1.Print();



    }

}
