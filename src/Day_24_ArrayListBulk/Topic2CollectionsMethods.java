package Day_24_ArrayListBulk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Topic2CollectionsMethods {
    public static void main(String[] args) {
        // We should ArrayList is a collection.
        // sort() this will sort the ArrayList in increasing order // we use it like Collections.sort(list)
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(90,45,67,23,12,67,89));

        Collections.sort(list1);

        System.out.println(list1);
        // list1.get(list1.size()-1)

        System.out.println("*************************");

        // max() // it will return to max value in the ArrayList.

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(90,788,67,1234,12,65636,89));

        System.out.println(Collections.max(list2));

        System.out.println("*********************************");
       // min () // it will return to min value in the ArrayList.

        int min = Collections.min(list2);  // we can say Integer also instead of int

        System.out.println("the min value is : "+min);

        // swap(CollectionType, index1 ,index3) : this will swap the index1 and index3
        System.out.println("Before the swap : "+list2);

        Collections.swap(list2,1,3);

        System.out.println("After the swap : "+list2);

        // replaceAll(CollectionType,oldValue, newValue )

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(90,55,788,67,1234,12,55,65636,89));

        System.out.println("Before the replaceAll : "+list3);

        Collections.replaceAll(list3,55,88);

        System.out.println("After the replaceAll : "+list3);

        ArrayList<String> STlist = new ArrayList<>();

        STlist.addAll(Arrays.asList("Ziya","Serbest","Bahar","Ziya"));



        Collections.replaceAll(STlist,"Ziya","Ozan");

        System.out.println("After the replaceAll: "+STlist);

        // frequency(CollectionType, Object): this will return the frequency of the given object
        //          from the given collectionType


        System.out.println("How many Ozan is in the list : " +Collections.frequency(STlist,"Ozan"));











    }
}
