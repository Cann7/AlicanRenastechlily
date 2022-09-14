package Day_26StaticMethodsConstructors;

public class Topic5_ConstructorsChaining {

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

    int a;
    double b;
    String Name;
    public Topic5_ConstructorsChaining(int num,double dnum,String name){
        this.a =a;  // we can not do a=a bcz code get confused // but if we do   this.a = a  its gonna work properly there is no issue
        this.b = dnum;
        this.Name = name;
    }

    public static void main(String[] args) {
        Topic5_ConstructorsChaining ins1 =new Topic5_ConstructorsChaining(30,100.23,"Gulay");
        /*ins1.a=10;
        ins1.b=90.456;
        ins1.Name= "Gulay";
        */

        System.out.println("The a value : " +ins1.a);
        System.out.println("The b value : " +ins1.b);
        System.out.println("The Name value : " +ins1.Name);
    }
}
