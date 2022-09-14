package Day_23_ArrayLists;

import java.util.ArrayList;

public class Topic1_ArrayListIntro {
    //Data Structure:
    //	1. Array
    //	2. Collection ==> only accepts objects
    //	3. Map ==>  only accepts objects

    // int [] arr=new int[3];
    // ArrayList<DataType>  listName = new ArrayList<DataType>();
    //DataType can not be primitive
    //has to be wrapper class object or different object type
    // String [] name = new String[6];
    // String [] name = {"Ziya","DED',"grt'} ==> arrays are static or size ca not be changed

    //ArrayList: part of Collections
    //			does not support primitives, only support none primitives
    //			size is dynamic, automatically adjusted
    //			has index numbers

    //what is the differences between array and array list
    //1.size = array size is fixed and ; arrraylist size is dynamic (flexible)
    //2.array accepts primitives arraylist doesnt accept primitives
    //3.array is data structure and arraylist is part of collection data structure

    public static void main(String[] args) {

        // ArrayList<DataType> ListName=new ArrayList<DataType>();
        ArrayList<Integer> Listname = new ArrayList<Integer>(); // size = 0
        // add() --> this will add element at the end of the ArrayList
        Listname.add(90); // ===> size of ArrayList will be 1 ; 90 will be assigned to index 0;
        Listname.add(80); // ===> size = 2 === 80 will be assign to index 1;
        Listname.add(84);
        Listname.add(85);
        Listname.add(93);
        Listname.add(90);  //  ===> size = 6  but index is 5
        System.out.println(Listname);  // in that case we don't need to put "to.String()"

        // add(index,value) == it will add the value to a specific index and will move the rest index back

        Listname.add(3,45);

        System.out.println("Add 45 to a specific index : " +Listname);

        Listname.add(7,100); // add(100)  this is okay bcz 7 index comes after 6 but we can t say 10 or 11 right now
        System.out.println(Listname);

       // Listname.add(10,100);
       // System.out.println(Listname);  ERROR bcz there is no 10 index   . out of bound



        // size() this method will give the size of ArrayList

        int sz = Listname.size(); // that will assign the size of Listname to "sz" variable.

        System.out.println("The size of the Listname is : "+sz);
        System.out.println("__________________________________");

        ArrayList<Integer>List2= new ArrayList<>(); // the size is 0;

        List2.add(List2.size(),90); // equal to just add()
        List2.add(List2.size(),9);
        List2.add(List2.size(),98); // add(98)
        List2.add(List2.size(),2); // --add(2)
        System.out.println(List2);


    }
}
