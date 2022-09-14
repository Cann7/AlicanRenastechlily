package Day_34_CollectionsContin.Queue;

import java.util.*;

public class Que {
    /*

 queue also known as a linear queue is the most basic version of a queue.
    The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue.
    It follows FIFO concept.
    The Java Queue supports all methods of Collection interface including insertion, deletion, etc.
PriorityQueue: PriorityQueue class which is implemented in the collection framework provides us a way to process the objects based on the priority.
This queue is a special type of queue. Its specialty is that it arranges the elements in a queue based on some priority.

     */

    public static void main(String[] args) {

     //   Queue<Integer> Q = new Queue<Integer>() {  Queue is an Interface we can not create Instance of the Queue directly

        Queue<Integer> q=new LinkedList<>();

        q.add(90);
        q.add(78);
        q.add(100);
        q.add(101);
        q.add(67);
        q.add(23);
        q.add(91);
        q.add(100);

        System.out.println("The Queue as Linked List : " +q);
        q.poll();  // removes item from the order of insertion
        System.out.println("The Queue as Linked List after poll : " +q);
        System.out.println("***************************************");

        Queue<Integer> q2=new ArrayDeque<>();

        q2.add(92);
        q2.add(7);
        q2.add(10);
        q2.add(11);
        q2.add(6);
        q2.add(3);
        q2.add(913);
        q2.add(105);

        System.out.println("The arraydeque as Queue : "+q2);
        q2.offer(3);  // adding to the tail,
        System.out.println("After the offer : "+q2);
        q2.remove(10);  // you can remove the specific item from the queue
        System.out.println("After the remove : "+q2);

        System.out.println("The size of Queue : "+q2.size());

        /*
        PriorityQueue: PriorityQueue class which is implemented in the collection framework provides us
        a way to process the objects based on the priority.
        This queue is a special type of queue.
        Its specialty is that it arranges the elements in a queue based on some priority.

         */

        System.out.println("**************************************");

        Queue<Integer> pq =new PriorityQueue<>();

        pq.add(89);
        pq.add(34);
        pq.add(100);
        pq.add(278);
        pq.add(96);
        pq.add(54);
        pq.add(1);
        pq.add(23);

        System.out.println("The Priority Queue : "+pq);
        pq.poll();
        System.out.println("The Priority Queue : "+pq);
        pq.poll();
        System.out.println("The Priority Queue : "+pq);
        pq.poll();
        System.out.println("The Priority Queue : "+pq);
        pq.poll();
        System.out.println("The Priority Queue : "+pq);
        pq.add(0);
        System.out.println("The Priority Queue : "+pq);
        pq.add(-789);
        System.out.println("The Priority Queue : "+pq);
        pq.poll();
        System.out.println("The Priority Queue : "+pq);



    }
}
