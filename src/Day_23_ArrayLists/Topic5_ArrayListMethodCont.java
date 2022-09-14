package Day_23_ArrayLists;

import java.util.ArrayList;

public class Topic5_ArrayListMethodCont {

    // contains(object obj) --> this method will check if arraylist has that object in  the list
    // if it its returns true else it returns false

    public static void main(String[] args) {

        ArrayList<Integer> ArrL = new ArrayList<>();
        ArrL.add(3);
        ArrL.add(2);
        ArrL.add(0);
        ArrL.add(8);
        ArrL.add(39);

        System.out.println("The list is : "+ArrL);

        boolean isThere = ArrL.contains(60);
        System.out.println("The answer is : "+isThere);  // this is false bcz there is no 60 // this is first way

        System.out.println("The number 0 is in the ArrayList : " +ArrL.contains(0)); // this is second way // we check the 0 if 0 is there it will give us true



        // equals() it checks if 2 arrayList are equal if they are it will return true else it will return false

       ArrayList<Integer> ArrL2 = new ArrayList<>();
        ArrL2.add(2);
        ArrL2.add(3);
        ArrL2.add(0);
        ArrL2.add(8);
        ArrL2.add(39);

        System.out.println("are the equal?: "+ArrL.equals(ArrL2));
        System.out.println("*********************");

        // isEmpty()-  it checks if array list is empty. If it is it will return true else it will return false

        ArrayList<Character> CHarr = new ArrayList<>();

        CHarr.add('R');

        System.out.println("Is it empty: "+CHarr.isEmpty());

        // clear(), it clears the arrayList

        CHarr.clear();// It clears all the objects in the List
        System.out.println("Is it empty: "+CHarr.isEmpty());






    }
}
