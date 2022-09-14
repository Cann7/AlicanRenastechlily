package Day_28_InheretenceOOP.Extends.Extends;

import Day_28_InheretenceOOP.Extends.Extends.Animal;
import Day_28_InheretenceOOP.Extends.Extends.Dog;
import Day_28_InheretenceOOP.Extends.Extends.Fish;

public class TESTClass {

    /*
Inheritance is an important pillar of OOP(Object-Oriented Programming).
It is the mechanism in java by which one class is allowed to inherit the features(fields and methods)
of another class.

Important terminology:

Super Class: The class whose features are inherited is known as superclass(or a base class or a parent class).
Sub Class: The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class).
The subclass can add its own fields and methods in addition to the superclass fields and methods.

Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class
 and there is already a class that includes some of the code that we want, we can derive our new class
 from the existing class. By doing this, we are reusing the fields and methods of the existing class.
How to use inheritance in Java
The keyword used for inheritance is extends.
 */

    public static void main(String[] args) {
        Animal an1= new Animal();
        an1.Name="Juju";
        an1.Color="Black";
        an1.legCount=4;
        an1.Age=2.5;
        an1.Gender="Female";


        an1.Display();
        System.out.println(an1);
        an1.Eat();
        an1.Grow();
        System.out.println("********************************");

        Dog dog1= new Dog();
        dog1.Name ="Ace";
        dog1.Age=1.5;
        dog1.Color="White";
        dog1.Gender="male";
        dog1.legCount=4;
        dog1.Toothcount=14;
        dog1.Eat();
        dog1.Grow();
        //dog1.Display();
        dog1.Shed();
        dog1.Walk();
        dog1.Display();
        System.out.println("*******************************");

        Fish fs =new Fish();

        fs.Name ="Ace";
        fs.Age=1.5;
        fs.Color="White";
        fs.Gender="male";
        fs.legCount=0;
        fs.FinCount=6;
        fs.Eat();
        fs.Grow();
        fs.Swim();
        fs.Display();

    }
}
