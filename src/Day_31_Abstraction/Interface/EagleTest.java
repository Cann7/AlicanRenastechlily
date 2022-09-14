package Day_31_Abstraction.Interface;

public class EagleTest {

    public static void main(String[] args) {

        Eagle eg =new Eagle();
        eg.Name="Renastech";
        eg.type="Bald";
        int age =eg.setAge(3);
        eg.setBreed("American");
        eg.setlegCount(2);
        eg.WingsCount(2);
        eg.Fly();
        eg.Live();
        System.out.println("Eagle Name : "+eg.Name);
        System.out.println("Eagle type : "+eg.type);


    }
}

