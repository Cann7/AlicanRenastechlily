package Day_12_BreakStatement;

public class Topic5_WhileLoop {

    public static void main(String[] args) {

        // the concept of While Loop
   // We define the starting point before the "while"  // it is not required
   // You have the end point in the while(Endpoint)
   // You have iteration inside the curly brackets
   // Step by step
   // 1) int i = 0
   // 2) while(condition i<10){
   // 3) i++ or i-- or i+=10 or ....
// }
        for (int i = 0; i < 10; i++) {   // for this we need start point thats the different between for and while
            System.out.print(" " +i);
        }
        System.out.println("\n" + "---------------------");

        int i = 0;
        while (i<10){  // you dont need start point
            System.out.print(" " +i);
            i++;  // ++i  at the this point  i value is the i++ and ++i;
        }




    }
}
