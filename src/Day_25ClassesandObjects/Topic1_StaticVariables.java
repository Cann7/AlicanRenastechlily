package Day_25ClassesandObjects;

public class Topic1_StaticVariables {
    //Static variables
//
// When a variable is declared as static, then a single copy of variable is created
// and shared among all objects at class level. Static variables are, essentially, global variables.
// All instances of the class share the same static variable.
//
//We can create static variables at class-level only.
//static: class member, can be called through the class
//there is only one copy of static shared by all objects
//
//            prefers to be called through class name
//
//            static ONLY accepts static
//
//
//    static members:
//            1. static variable (global variables)
//            2. static methods
//            3. static initializer block
//            4. static nested class
//

    //static variable: declared outside any block with static keyword.
////there is only one copy of static shared by all objects


    //Instance: every single object of the class has its own copy
//
    //local variable: variables that are declared in a block
    //instance variables: declared outside the blocks
    //Static variables : declared outside the blocks with a static keyword

    static int age = 10;
    int b =14;

    public static void main(String[] args) {
        Topic1_StaticVariables newTopic = new Topic1_StaticVariables();

        System.out.println(newTopic.b);
        System.out.println("The value of age : "+newTopic.age);    // this age is not coming otomaticly bvz it is its in the  class level but b is in the object class and it comes auotomaticly

        Topic2_newClass Ob1 =new Topic2_newClass();
        System.out.println("the name is : "+Ob1.name);
        System.out.println("The last name is : "+Ob1.Lastname); // lastname comes automaticly bcz it is in the object level

        //System.out.println("the name is : "+Topic2_newClass.name); this is the second way but we can call him lastname only we can call name bcz its class level
    }
}
