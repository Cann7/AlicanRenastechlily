package Day_26StaticMethodsConstructors;

import MyUtil.StaticTestClass;

public class Topic1_StaticMethods {
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
    public static void main(String[] args) {



        System.out.println("Print Static int variable : "+StaticTestClass.Name);
        System.out.println("Print the Static num : "+StaticTestClass.num);
        //System.out.println("Print the Non-static Name2: "+StaticTestClass.Name2);
        System.out.println("***************************************");

        StaticTestClass Obj =new StaticTestClass();

        System.out.println("Print non-static Name2: "+Obj.Name2); // but here those are the non static variables we have to create obj classes here and then we can call and print
                                                                   // That's very important
        System.out.println("Print non-static num2 : "+Obj.num2);



        System.out.println("Print static name : "+Obj.Name); // it doesn't come out directly(bcz its static variable) but its there when we wrote the Name it works print
        System.out.println("Print Static num2 : "+Obj.num); // we can still reach the static variables

    }
}
