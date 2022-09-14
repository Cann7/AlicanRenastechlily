package Day_26StaticMethodsConstructors;

public class Topic6_ConstructorsChainingCont {

      /*
    Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
Constructor chaining can be done in two ways:
Within same class: It can be done using this() keyword for constructors in same class
From base class: by using super() keyword to call constructor from the base class.-- we will see this later
Why do we need constructor chaining ?
This process is used when we want to perform multiple tasks in a single constructor
rather than creating a code for each task in a single constructor we create a separate constructor for each task
and make their chain which makes the program more readable.
     */


    public Topic6_ConstructorsChainingCont(int num1){

        // this: refers to object instances
//        //this.: Instance variables
//        //this(): used for calling constructors within current class

        ///
//    constructor calls:(chainning) by using this() keyword
//            1. only constructor can call other constructor
//            2. constructor cannot be called by its name,  this() is used for calling
//            3. constructor call needs to be at the first step
//            4. One constructor can only call one constructor
//            5. Contructor cannot call itself or conatin itself


       // System.out.println("This is from the Constructor that takes int value : "+num1);  if we do commnet off it give us error
        this("Sevgi");
        System.out.println("This is from the Constructor that takes int value : "+num1);

    }

    public Topic6_ConstructorsChainingCont(String name1){

        System.out.println("This is from the String Constructors that takes String : "+name1);


    }

    public static void main(String[] args) {
        Topic6_ConstructorsChainingCont ins = new Topic6_ConstructorsChainingCont(56);
       // Topic6_ConstructorsChainingCont ins1 = new Topic6_ConstructorsChainingCont("Sevgi");
    }

}
