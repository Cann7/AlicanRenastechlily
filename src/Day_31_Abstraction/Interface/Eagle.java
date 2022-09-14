package Day_31_Abstraction.Interface;

public class Eagle implements Animal,Birds{

    String Name;
    String type;
    String Breed;
    int leg;
    int age;
    int wings;

    @Override
    public void setBreed(String br) {
        this.Breed=br;

    }

    @Override
    public void setlegCount(int lg) {
        this.leg=lg;

    }

    @Override
    public int setAge(int age) {
        this.age=age;
        return age;

    }

    @Override
    public void Fly() {

        System.out.println("Eagles Fly");

    }

    @Override
    public void Live() {

        System.out.println("Eagles Live");

    }

    @Override
    public void WingsCount(int wg) {

        this.wings=wings;

    }
}
