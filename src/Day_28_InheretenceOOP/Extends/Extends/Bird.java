package Day_28_InheretenceOOP.Extends.Extends;

import Day_28_InheretenceOOP.Extends.Extends.Animal;

public class Bird extends Animal {

    //since we use extands keyword to get parent class for bird class (child class)
    //you will have all variables , method extended to your bird class

    //  below all the variables and methods will be inherited from animal class (parent)
//    public String name;
//    public int age;
//    public int legcount
//    public  String color;
//    public  char gender;

    //
//
//    public void Eat(){
//        System.out.println("Animals eat");
//
//     public void Grow(){
//        System.out.println("Animals grow");


    public int wingCount; // Bird Specific Variable

    public void Fly(){ // Bird Specific Method
        System.out.println("Birds Fly");
    }


}
