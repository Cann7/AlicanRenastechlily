package Day_26StaticMethodsConstructors;

public class Topic4_Constructors {

    // Constructor in java is a special method that is used to initialize object
    //The Constructor is called when an object of the class is created ,
    // it can used to set initial values for object attributes.

    //1- Constructor needs to have same name that class have.
    //2- Even if you don't create one constructor java will create one as default.


    // we use the same name of the class ex : public Topic4_Constructors(){
    // }
    public Topic4_Constructors(){
        System.out.println("This is from Constructors");
    }
    public Topic4_Constructors(int a){
        System.out.println("This is from second constructor with a value : "+a);
    }

    public Topic4_Constructors(String Name,double money){
        System.out.println(Name + " has a lot of "+money);
    }


    public static void main(String[] args) {

        Topic4_Constructors obj =new Topic4_Constructors(); // WHEN CREATE OBJECT IT CALLS AUTOMATICALLY this get first class
        Topic4_Constructors obj1 =new Topic4_Constructors(90); // this gets second class
        Topic4_Constructors obj3 = new Topic4_Constructors("Sam",90.87);  // this gets third class

    }

}
