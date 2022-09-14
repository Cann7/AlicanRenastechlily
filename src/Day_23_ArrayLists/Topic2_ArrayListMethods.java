package Day_23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Topic2_ArrayListMethods {
    public static void main(String[] args) {


        // get(index) --> it is used to get specific object from the index


        ArrayList<Integer> List1 = new ArrayList<>();

        List1.add(0);
        List1.add(2);
        List1.add(3);
        List1.add(5);
        List1.add(8);

        //List1.size(); // this will return 5

        int num5 = List1.get(3);
        System.out.println("The number that is in index 3 is  : " +num5);

        System.out.println("*********************************");

        // write a code that will print every element's inside of arrays list 1 by 1 ;
        // List1= [0,2,3,5,8]
        for (int i = 0; i < List1.size(); i++) {

            System.out.println("The number that is in index : " +i+" is "+List1.get(i));
        }

       //  System.out.println("The number that is in index 10 : " +List1.get(5));  if we do this it will give us error bcz there is no index 5

        System.out.println("********************");

        // indexof() this will return the index of the value that you specified


        ArrayList<Character> CH = new ArrayList<>();

        CH.add('g');
        CH.add('t');
        CH.add('i');
        CH.add('q');
        CH.add('b');

        int indx = CH.indexOf('q');
        System.out.println("The index of 'q' is "+indx);

        // if the item that you want the index for is not in the arraylist it will return -1

        System.out.println("The index of 'a' : "+CH.indexOf('a'));

        CH.add('i');
        //if the item that you want is there multiple times index0f() will return to the first index that has been
        System.out.println("The index of 'i' is : "+CH.indexOf('i'));
        System.out.println("***************************");


        // set(index,item), this takes 2 params, which one is  the index the other is the item,

        ArrayList <String> ST= new ArrayList<>();

        ST.add("Eda");
        ST.add("jason");
        ST.add("raz");
        ST.add("yaseen");
        ST.add("seray");

        System.out.println("The ArrayList is : "+ST);

        ST.set(1,"sam");
        System.out.println("The ArrayList is : "+ST);

        ST.set(ST.indexOf("seray"),"bahar");  // if we dont know seray's index we can do like that way!!!!!!!!!!
        System.out.println("The ArrayList is : "+ST);

    }
}
