package Day_29_OOP_Inheretance.Override;

public class Topic2_OverrideTest extends Topic1_OverrideClass {

    //    //method overriding: same method name, same parameter, same return-type  (MUST)
////				   MUST happen in the sub class
////				   access modifer MUST be same or more visible
//                     Private methods can not be @override
    //                 Protected methods can be

////				   ONLY the instance methods can be overridden
////				   @Override annotation MUST be applicable
    // static, final, abstract,sycn..
    // final methods can not be override.
    // you can not override the constructor of super(Parent) class
////

    // OverLoading vs Override  = Override is used when we want to threat the parent method to have different
    // reaction when it is called from the child instance,
    // Overloading : We use overloading to use the same method for different input parameters and return types
    // it is for the same class methods.


    @Override
    public void Eat() {
        //super.Eat();     // we explained in topic3 test class
        System.out.println("Bakir Eat");
    }

    @Override
    public void Sub() {
        System.out.println("This is protected from Sub-Class");
    }
}
