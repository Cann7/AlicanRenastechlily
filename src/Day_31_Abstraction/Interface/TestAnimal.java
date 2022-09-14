package Day_31_Abstraction.Interface;

public class TestAnimal {
    public static void main(String[] args) {
        //Animal an=new Animal();  // Interfaces can not be used to create an object from itself

        Dog dg =new Dog();
        System.out.println(dg.setAge(2));
        dg.setBreed("Doberman");
        dg.setName("Lilly");
        dg.setlegCount(4);
        System.out.println("Dog name : "+dg.Name);
        System.out.println("Dog Age : "+dg.age);
        System.out.println("Dog Breed : "+dg.breed);
        System.out.println("Dog Leg Count : "+dg.legCount);


    }
}
