package Day_3ArtimaticOperations;

public class StringsVariable {

    public static void main(String[] args) {
        // String is NOT a primitive data type.

        String name = "12312"; // this is a text not a number
        String name2 = "Alican"; // that is also a text

        String name3 = name+name2;
        System.out.println(name3);
        String name4 = name + " likes to teach " + name2;
        System.out.println(name4);

        System.out.println("this is name2: " + name2);
        int a = 8;

        System.out.println("this is the number a : " +a);

        float numf2 = 7.9f;

        System.out.println("this is the float number : " + numf2);
        String thisisatext = "alican this is a text 134565";

        char ch = 'R';
        String st = "Toys"+"-"+ch+" "+"Us";
        System.out.println(st);

        int numnum = 34;
        String nam20 = "this is us";
        String nam30 = nam20 + " " +numnum;
        System.out.println(nam30);

    }

}
