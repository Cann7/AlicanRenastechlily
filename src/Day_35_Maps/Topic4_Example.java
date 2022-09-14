package Day_35_Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class Topic4_Example {

    // Write the code where it maps Region 1, Region 2 and Region 3 to a another Mapping where
    // it has the Manager name as key where
    // it linked to multiple Employees those are represented by their firstname

    public static void main(String[] args) {
     //                          key    values
        HashMap<String,HashMap<String, ArrayList<String>>> Str = new HashMap<>();
        // Map name = new HashMap<>();

        ////Region 1 Employees
        ArrayList<String> list1= new ArrayList<>();
        list1.add("Bakir");
        list1.add("Serdar");
        list1.add("Yaseen");

        //Region 2 Employees
        ArrayList<String> list2= new ArrayList<>();
        list2.add("Gulay");
        list2.add("Cevdet");
        list2.add("Ziya");

        //Region 3 Employees
        ArrayList<String> list3= new ArrayList<>();
        list3.add("Jason");
        list3.add("Ozan");
        list3.add("Recep");
        list3.add("Cenkay");

        String manager1 = "Alan";
        String manager2 = "Sam";
        String manager3 = "Sevgi";

        HashMap<String, ArrayList<String>> R1 = new HashMap<>();
        R1.put(manager1,list1);

        HashMap<String, ArrayList<String>> R2 = new HashMap<>();
        R2.put(manager2,list2);

        HashMap<String, ArrayList<String>> R3 = new HashMap<>();
        R3.put(manager3,list3);

        Str.put("Region1",R1);
        Str.put("Region2",R2);
        Str.put("Region3",R3);

        Str.get("Region2").get("Sam").add("Paiman");
        System.out.println(Str.get("Region2").get("Sam"));


    }

}
