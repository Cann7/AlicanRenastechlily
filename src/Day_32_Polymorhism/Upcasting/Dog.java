package Day_32_Polymorhism.Upcasting;

public class Dog extends Animal{

    int age;


    @Override
    public void ParentMethod(){
        System.out.println("This is parent Method in the child object because of override");
    }
    public void ChildMethod(){
        System.out.println("This is from Child Method its own Method");
    }
}
