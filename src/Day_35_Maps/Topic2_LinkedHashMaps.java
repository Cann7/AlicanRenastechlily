package Day_35_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Topic2_LinkedHashMaps {
    /*

 Just like Hashmaps but it keeps the insertion order.
    LinkedHashMaps are slower than Hashmaps when it comes to adding, deleting and searching.

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
remove(key object) -- > this will remove a key-value pair from the map

     */

    public static void main(String[] args) {
        Map<String,Integer> Lmp =new LinkedHashMap<>();

        Lmp.put("Ziya",98);
        Lmp.put("Seray",1000);
        Lmp.put("Arion",5000);
        Lmp.put(null,null);
        System.out.println("The LinkedHashMaps: "+Lmp);

    }
}
