package Day_11_ForLoops;

public class Topic1_ForLoopCont {
    public static void main(String[] args) {

        //for(startpoint; endpoint; iteration){

        // Code Block that will be ran

        //} this is how we declare For Loop


        // Write a for loop that increase by 2 for each iteration
        for(int i = 1; i<100; i+=2){ // 1,3,5 .........101
            System.out.println("The value of i: "+i); //1,3,5,......99
        }


          // write a code that counts the iterations
        int count = 0;
        for(int i = 1; i<100; i+=2){
            System.out.println("The value of i: "+i);   // I value 1,3,5 ..........99
            count++; // count = count +1;  same thing  // 1,2,3,4,5,6,7,8,.........50
        }
        System.out.println(count);

    }
}
