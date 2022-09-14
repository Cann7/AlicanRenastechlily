package Day_26StaticMethodsConstructors;
import MyUtil.StaticTestClass;


public class Topic2_StaticMethodCont {

    //When a method is declared with static keyword, it is known as static method.
// Any static member can be accessed before any objects of its class are created,
// and without reference to any object.
// Methods declared as static have several restrictions:
//
//They can only directly call other static methods.
//They can only directly access static data.


    public void TestNonStatic(){
        System.out.println("This is from the other Non-static Method");

    }

    public void Test(){
        TestNonStatic(); // can be called since it is not declared as Static
        System.out.println("This is from Non-Static method :");
    }
    public static void StaticMethod(){
        System.out.println("Hello from static method");
    }



    public static void main(String[] args) {

        StaticTestClass.PrintStatic();
        StaticTestClass ins =new StaticTestClass();  // THERE IS NO ERROR BCZ WE CREATED OBJ THEN WE GOT NON STATIC METHOD
        ins.Print();

        StaticMethod();

        Topic2_StaticMethodCont obj1 =new Topic2_StaticMethodCont();

        obj1.Test();
        obj1.StaticMethod();

       // TestNonStatic(); // when calling a non-static method from a static method it will throw error



    }
}
