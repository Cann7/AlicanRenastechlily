package Day_32_Polymorhism.Upcasting;

import java.util.ArrayList;
import java.util.List;

public class TestTheAnimals {

    public static void main(String[] args) {
        Dog dg =new Dog();
        dg.name="This is the name";
        dg.breed="Doberman";
        dg.age=2;
        System.out.println("The dog name : "+dg.name+ " this is dog age : "+dg.age+ " this is dog breed : "+dg.breed);
        dg.ParentMethod();

        Animal dg1 =new Dog(); // THIS IS UPCASTING
        dg1.name="NameofParent";
        dg1.breed="golden";
        System.out.println("The dog name : "+dg1.name+  " this is dog breed : "+dg1.breed);
        dg1.Parentown();
        dg1.ParentMethod();

        //List arr=new ArrayList();


        // Upcasting is applicable for Interfaces and Abstract Classes as well, Even tho we can not create
        // object or Instance of Interface or Abstract Class

    }
}
