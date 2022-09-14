package Day_36_FileStringBuilderIterator;

import com.sun.xml.internal.ws.util.QNameMap;

import java.util.ArrayList;
import java.util.Iterator;

public class Topic2_Iterator {     // iterator :  yineleyici
    /*

 Iterators in Java are used in the Collection framework to retrieve elements one by one.
     It is a universal iterator as we can apply it to any Collection object.
     By using Iterator, we can perform both read and remove operations

     Methods:

     1) hasNext() -- > it checks it cursor at the end
     2) next() -- > will point to the current item in the iterator
     3) remove() --> it will remove the current item in the iterator

     */

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        arr.add("Ziya");
        arr.add("Serdar");
        arr.add("Gulay");
        arr.add("Bahar");

        Iterator it =arr.iterator(); // Iterator from arr ArrayList
        while (it.hasNext()){  // {Ziya, Serdar , Gulay , Bahar}
            // System.out.println(it.next());
            String names =(String) it.next();
            if (names == "Gulay"){
                it.remove();
            }

        }
        System.out.println("This is the ArrayList : "+arr);
      //   System.out.println(it.next());  this will throw NoSuchElementException
    }
}
