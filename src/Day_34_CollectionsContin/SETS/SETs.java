package Day_34_CollectionsContin.SETS;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SETs {

    /*
    //all type of sets are not going to accept dublicates

    //HashSet<>()
    ///Hashset
    //accept null values
    //it doesnt accept dublicates
    //it has sort logic but it is not always from small to large

    // LinkedHashSet<>()
    //it doesnt accept dublicates
    //it does not sort
    //accept null values

    //TreeSet<>()
    //it doesnt accept dublicate values
    //it does not accept null values
    //it is going to sort from small to large

     */
    public static void main(String[] args) {

          //HashSet<>()

                ///Hashset
                //accept null values
                //it doesnt accept dublicates
                //it has sort logic but it is not always from small to large

        Set<Integer> HS =new HashSet<>();
        HS.add(90);
        HS.add(1);
        HS.add(3);
        HS.add(9);
        HS.add(1);
        HS.add(1);
        HS.add(null);
        HS.add(null);
        HS.remove(null);
        System.out.println("The HashSet :"+HS); // it doesnt have dublicates it doenst allow to do that


        Set<String> HS1 =new HashSet<>();
        HS1.add("Ozan");
        HS1.add("Serdar");
        HS1.add("Ziya");
        HS1.add("Recep");
        System.out.println("The HashSet is : "+HS1);

        // LinkedHashSet<>()

                //it doesnt accept dublicates
                //it does not sort
                //accept null values


        Set<String> LS =new LinkedHashSet<>();
        LS.add("Sevgi");
        LS.add("Serdar");
        LS.add("Elif");
        LS.add("Sherevan");
        LS.add("Sevgi");
        LS.add(null);
        System.out.println("The LinkedHashSet : "+LS);

        //TreeSet<>()

        //it doesnt accept dublicate values
        //it does not accept null values
        //it is going to sort from small to large

        Set<Integer> ts=new TreeSet<>();
        ts.add(1);
        //ts.add(null); // it doesn't accept null here because of treeset
        ts.add(34);
        ts.add(20);
        ts.add(90);
        ts.add(1);
        System.out.println("The TreeSet : "+ts);

        Set<String> ts1=new TreeSet<>();
        ts1.add("Yaseen");
      //ts1.add(null);  // will throw Null pointerException
        ts1.add("Gulay");
        ts1.add("Ziya");
        ts1.add("Cenkay");
        ts1.add("Serdar");
        ts1.add("Ziya"); // and also treeSet doesn't accept duplicates and null

        System.out.println("The String Values : "+ts1);






    }
}
