package Day_31_Abstraction.Interface;

public class Dog implements Animal{

    public String Name;
    public int legCount;
    public String breed;
    public int age;

    @Override
    public void setBreed(String br) {
        this.breed= br;
    }

    @Override
    public void setlegCount(int lg) {
         this.legCount=lg;
    }

    @Override
    public int setAge(int age) {
        this.age=age;
        return this.age;
    }

    public void setName(String name){
        this.Name=name;
    }
}
