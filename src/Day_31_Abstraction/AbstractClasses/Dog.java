package Day_31_Abstraction.AbstractClasses;

public class Dog extends Animal{

    String name;
    double age;
    String breed;

    @Override
    public void setBreed(String breed){
        this.breed=breed;
    }
    public void setName(String nam){
        this.name=nam;
    }
    public void setAge(double age){
        this.age=age;
    }

    @Override
    public void SaySomething(){
        super.SaySomething(); // this will call the parent SaySomething  // if we dont put super here its not gonna print it "this is from Abstract Class and non abstract method
        System.out.println("This is from the Dog Classes");  // this is a new addition to SaySomething in the Child class
    }

}

