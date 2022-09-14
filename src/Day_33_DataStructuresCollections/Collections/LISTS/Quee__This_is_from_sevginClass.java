package Day_33_DataStructuresCollections.Collections.LISTS;

import com.sun.javaws.jnl.LibraryDesc;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Quee__This_is_from_sevginClass {

    //      Queue<String> q = new Queue<String>(); Queue is interface
    // Queue(I) : does not have index number , size dynamic , it accepts duplicates,
    // first in first out order.
    //        Pool() Poll(): removes the first object in the queue.

    public static void main(String[] args) {
        Queue<Integer> numbers=new PriorityQueue<>(); //FIFO  it will sort in some queue logic
        // sort logic is not always from small to large
        // it has own sort logic

        numbers.add(20);
        numbers.add(20);
        numbers.add(1);
        numbers.add(11);
        numbers.add(2);
        numbers.add(200);
        numbers.add(5);
        numbers.add(15);

        System.out.println(numbers);
        Integer number= numbers.poll(); // no index in  queue it is going to pool the smallest element and remove from List
        System.out.println(number);  //Poll(): removes the first object in the queue.


        System.out.println(numbers);//[2, 5, 200, 20, 15]

        System.out.println("******************************");

        Queue<Integer> numbers2 = new ArrayDeque<>(); // no sort logic // FIFO
        numbers2.add(20);
        numbers2.add(20);
        numbers2.add(1);
        numbers2.add(11);
        numbers2.add(2);
        numbers2.add(200);
        numbers2.add(5);
        numbers2.add(15);

        System.out.println(numbers2);

        Integer number2= numbers2.poll();
        System.out.println(number2); // 20
        System.out.println(numbers2);


    }
}
