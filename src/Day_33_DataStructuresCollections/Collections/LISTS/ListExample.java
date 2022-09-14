package Day_33_DataStructuresCollections.Collections.LISTS;

import MyUtil.StaticTestClass;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); // this is how I initialized an ArrayList
        numbers.add(89);
        numbers.add(2);
        numbers.add(90);

        numbers.add(89); // List allows you to have duplicates
        System.out.println("The ArrayList is : " +numbers); // The order is in insertion order

        System.out.println("******************************************");

        List<Integer> LS = new ArrayList<>();  // Upcasting polymorphism
        LS.add(90);
        LS.add(87);
        LS.add(23);
        System.out.println("The List of Numbers : "+LS);

        System.out.println("******************************************");

        LinkedList<Integer> lnumbers = new LinkedList<>();
        lnumbers.add(93);
        lnumbers.add(65);
        System.out.println("The Linked List Values : "+lnumbers);

        System.out.println("******************************************");

        List<String > LSL =new LinkedList<>(); // Polymorphism // Upcasting
        LSL.addAll(Arrays.asList("Sherevan","Serdar","Sevgi"));
        System.out.println("The String List Values : "+LSL);

        System.out.println("******************************************");

        // Stack implementation
        // pop() -- it deletes or removes the item from the top of the collection and returns to the item that has been removed
        // push() -- it adds the item to the top of the collection
        // peek() -- it peeks the value at the top the collections and returns the item at the top.

        Stack<Integer> st = new Stack<>();
        st.push(90);
        st.push(86);
        st.push(23);
        System.out.println("The Stack Collection :"+st);
        if (st.peek()==23){  // we added 23 last thats why it give us 23 and its peek
            System.out.println("The peek value is : "+st.peek());
        }

        int popValue = st.pop();
        System.out.println("The pop value is : "+popValue);
        System.out.println("The Stack Collection :"+st);

        // This is gonna be homework dont forget !!!!
        // Write a method where takes a string where it contains list of parenthesis it  finds the brackets or parenthesis are not closed properly
        // {[[()]]}
        // {[(){}}

        System.out.println("********************************");


        // empty() // returns to a boolean value either true or false based on if the stack is empty

        System.out.println("Is Stack Empty : "+st.empty());

        List<Integer> st1 = new Stack<>();

        /*

        List <data-type> list1= new ArrayList();
        List <data-type> list2 = new LinkedList();  ==> Upcasting
        List <data-type> list3 = new Vector();
L       ist <data-type> list4 = new Stack();

         */


        //


    }

}
