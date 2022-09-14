package Day_23_ArrayLists;

import java.util.ArrayList;

public class Topic4_ArrayListExamp {

    // write a method where it takes arrayList of Strings as input parameters and returns and ArrayList where
    // all the duplicates are removed;

    public static ArrayList<String> Name(ArrayList<String> arr){

        for (int i = 0; i < arr.size(); i++) {

            String nam= arr.get(i);  // i = 0 nam = ziya
            arr.remove(nam); // remove the item

            if (arr.indexOf(nam) == -1){ //

                arr.add(i,nam);

            }

        }
        return arr;

    }

    public static void main(String[] args) {

        ArrayList<String> STnames =new ArrayList<>();

        STnames.add("Ziya");
        STnames.add("Sam");
        STnames.add("Ziya");
        STnames.add("Sevgi");
        STnames.add("Huseyin");
        STnames.add("Ziya");  // it keeps ziya bcz there is no more ziya thats why
        // STnames =[Ziya,Sam,Ozan,Sevgi,Huseyin,Ziya]
        System.out.println(Name(STnames));


    }
}
