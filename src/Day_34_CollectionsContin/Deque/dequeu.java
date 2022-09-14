package Day_34_CollectionsContin.Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class dequeu {
    /*
       Deque interface present in java.util package is a subtype of the queue interface
       It can either be used as a queue(first-in-first-out/FIFO) or as a stack(last-in-first-out/LIFO).
       Deque is the acronym for double-ended queue.
	   // Add at the last deque.add();
        // Add at the first addFirst();
        // Add at the last addLast();
        // Add at the first push();
        // Add at the last offer();
        // Add at the first offerFirst();
      // We can remove the first element removeFirst();
     / / or the last element.  removeLast();

     */

    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();
        // Add all the last deque.add();
        dq.add(100);
        dq.add(1);
        dq.add(106);
        dq.add(10);
        System.out.println("The Deque : "+dq);
        // Add first
        dq.addFirst(23); // Add to the first or to the head
        System.out.println("The Deque : "+dq);
        // Add last
        dq.addLast(89);// Add to the Tail
        System.out.println("The Deque : "+dq);
        // Add first push
        dq.push(76);
        System.out.println("The Deque : "+dq);
        // Add to the last offer
        dq.offer(30);
        System.out.println("The Deque : "+dq);

        Deque<Integer> DQasList =new LinkedList<>();


    }

}
