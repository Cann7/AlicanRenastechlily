package Day_35_Maps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Topic2_HashMaps {
    public static void main(String[] args) {

        /*

         - in order to access a value, you need to know the key
- the advantage of this,
-it uses a technique where it makes a large string to present the same string but in lower size(Hashing)
- Does not sort or keep the orders of insertion

         */

        Map<String,Integer> mp= new HashMap<>(); // upcasting Polymorphism

        HashMap<Integer,Integer> mp1 =new HashMap<Integer,Integer>();

             /*
Methods:

clear() --> This method removes every object from the map
containsKey(object) ---> To check if map has specific key
containsValues(Object) -- > to check if map has specific value
entrySet() -- > this is to create a set out of the key value pair (set view of map) (Mostly used with Map.Entry<key object, value object> )
get(key Object) -- this method returns to the value of the key being used. (it returns null if the map does not contain that key)
put(key Object, value Object) -- > it puts the key and value to the map.
keySet() --> It return a set view of the keys;
values() -- > it create a collection out of all the values in the map
putAll(Map) -- > putting all the key-value pairs from one map to another
size() --> Returns the number of key-pair in the map.

         */
        //put(key Object, value Object) -- > it puts the key and value to the map.
        mp.put("Sam",6);
        mp.put("Ziya",10);
        mp.put("Cevdet",25);
        System.out.println("The HashMap is : "+mp);

        //get(key Object) -- this method returns to the value of the key being used. (it returns null if the map does not contain that key)
        System.out.println("The Value for Cevdet key is : "+mp.get("Cevdet")); // it gets value for example we can put 25 and get cevdet

        // containsKey(object) ---> To check if map has specific key
        System.out.println("Does it contains Ziya as a key : "+mp.containsKey("Ziya")); // it will return boolean value // it is key sensitive if we do lower case it will be false !!!

        mp.put(null,null); // Null are allowed to be used in Hashmaps as key and value.
        System.out.println("The HashMap is : "+mp);

        //containsValue(Object) -- > to check if map has specific value
        System.out.println("Does Map contain 25 : "+mp.containsValue(90));

        //size() --> Returns the number of key-value pairs in the map.
        System.out.println("The size of mp Map is :"+mp.size());

        //clear() --> This method removes every object from the map
        mp.clear();
        System.out.println("The Map after clear() method : "+mp);

        mp.put("Sam",6);
        mp.put("Ziya",10);
        mp.put("Cevdet",25);

        // keySet() --> It return a set view of the keys;
        System.out.println("The KeySet for mp Map is : "+mp.keySet());
        HashSet<String> keys= new HashSet<>(mp.keySet());

        System.out.println("The Keys are : "+keys);

        // values() -- > it create a collection out of all the values in the map
        System.out.println("The Values in the Map:"+mp.values());
        ArrayList<Integer> values = new ArrayList<>(mp.values());
        System.out.println("The ArrayList of values : "+values);

        // entrySet() -- > this is to create a set out of the key value pair (set view of map)
        // (Mostly used with Map.Entry<key object, value object> )
        System.out.println("The set view of key-value pairs : "+mp.entrySet());

        // putAll(Map) -- > putting all the key-value pairs from one map to another
        Map<String,Integer> mp2 =new HashMap<>();
        mp2.put("Gulay",80);
        mp2.put("Yaseen",-10);
        mp.putAll(mp2);
        System.out.println("After adding mp2 to the mp : "+mp);

        // remove(obj key); // it removes the pair all together
        mp.remove("Cevdet");
        System.out.println("After remove : "+mp);

        mp.put("Gulay",10000); // This will update the value of existing key-value pairs.
        System.out.println("After adding Gulay again with new value : "+mp);  // those are the how do we do updating

        Map th = new HashMap();
        th.put("Ziya",89);         // key,value
        th.put(90,98);             // key,value
        th.put(90.877,"Yaseen");   // key,value
        System.out.println("The randomized data types : "+th);
//        var a =th.get("Ziya");
//        System.out.println("The is the var : "+a);


    }
}
