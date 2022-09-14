package Day_29_OOP_Inheretance.Override;

public class Topic1_OverrideClass {

    public String FirstName;
    public String LastName;
    public int age;

    public void Display(){
        System.out.println("The FirstName : "+FirstName+ " LastName : "+LastName+ " Age : " +age);
    }
    public void Eat(){
        System.out.println("People Eat");
    }
    protected void Sub(){
        System.out.println("This is protected Method");
    }
}
