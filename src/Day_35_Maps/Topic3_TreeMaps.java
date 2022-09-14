package Day_35_Maps;

import java.util.TreeMap;

public class Topic3_TreeMaps {

    /*

      - TreeMap is sorted according to the natural ordering of its keys
- This proves to be an efficient way of sorting and storing the key-value pairs.
- Does not take Null for key.
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
remove(key object) -- > this will remove a key-value pair from the map

     */

    public static void main(String[] args) {

        TreeMap<String,Integer> Tmp = new TreeMap<>(); // This is not upcasting
        Tmp.put("Ziya",78);
        Tmp.put("Serdar",1000);
        Tmp.put("Sam",55);
        Tmp.put("Bakir",100000);
        Tmp.put("This",null);  // Does not take Null for key.
        System.out.println("The TreeMap : "+Tmp);
    }
}
