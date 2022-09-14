package Day_28_InheretenceOOP.Extends.Extends;

import Day_28_InheretenceOOP.Extends.Extends.Animal;

public class Dog extends Animal {

    //since we use extands keyword to get parent class for bird class (child class)
    //you will have all variables , method extended to your Dog class

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


    public int Toothcount;

    public void Shed(){
        System.out.println("Dogs shed");
    }
    public void Walk(){
        System.out.println("Dogs walk or run");
    }
    public void TeethCount(){
        System.out.println("Dogs ToothCount : "+Toothcount);
    }


}
