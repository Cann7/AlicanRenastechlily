package Day_29_OOP_Inheretance.Override;

public class Topic3_TESTClass {
    public static void main(String[] args) {
        Topic2_OverrideTest Bakir=new Topic2_OverrideTest();

        Bakir.FirstName="Bakir";
        Bakir.LastName="Murad";
        Bakir.age=23;

        Bakir.Display();
        Bakir.Eat();  // when we write the override it calls from overridetest class bcz its also calss from parent class which is topic1 override class and get to the here whiich is child class
                      // Also if we dont wanna get anything from parent class we can just make // comment for super method and printing whatever we want
        System.out.println("**************************************");
        Topic1_OverrideClass people =new Topic1_OverrideClass();

        people.FirstName="people";
        people.LastName="human";
        people.age=109;

        people.Eat();
    }
}
