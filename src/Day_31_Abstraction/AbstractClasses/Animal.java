package Day_31_Abstraction.AbstractClasses;

abstract class Animal {

    public static String Name = "Name of the animal";
    //String name1;
    public Animal(){
        System.out.println("This is constructor");
    }

    abstract void setBreed(String breed);   // abstract cann not have body  // you can not have an abstract method in the non -Abstract Class

    public void SaySomething(){
        System.out.println("This is from Abstract Class and non abstract method");

    }
}
