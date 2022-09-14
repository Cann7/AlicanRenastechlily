package Day_31_Abstraction.AbstractClasses;

public class Test {
    public static void main(String[] args) {

        Dog dg=new Dog();
        dg.setName("Max");
        dg.setAge(2.5);
        dg.setBreed("Doberman");
       // Animal an=new Animal();             // we can not create an object of Abstract Class
        System.out.println("The Age of the dog : "+dg.age);
        System.out.println("The Name of the dog : "+dg.name);
        System.out.println("The Breed of the dog : "+dg.breed);
        dg.SaySomething();
        System.out.println(dg.Name);
    }
}
