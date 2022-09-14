package Day_24_ArrayListBulk;

import java.util.Scanner;

public class InstanceofHuman {

   // Scanner sc = new Scanner();

    public static void main(String[] args) {

        Human FirstHuman = new Human();

        FirstHuman.SetEssentials(36,"Adem","Eve");
        FirstHuman.SetNonEssentials("QA Engineer","Bi",6.9,190.90);
        FirstHuman.PrintJobHanW();
        int Adamsage = FirstHuman.GetAge();

        System.out.println("The age of Adam : "+FirstHuman);
        System.out.println("The Name for Human instance :  "+FirstHuman.GetName());

        System.out.println("The Age is  : " +FirstHuman.age);

    }

}
