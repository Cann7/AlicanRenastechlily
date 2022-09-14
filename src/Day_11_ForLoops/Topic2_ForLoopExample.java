package Day_11_ForLoops;

public class Topic2_ForLoopExample {

    // Write a code where the prints all the even numbers between 0 to 100;(100 included)

    // if a number is divided by 2 with no reminder then it is a even number
    public static void main(String[] args) {


        int totaliter = 0;
        System.out.println("the even numbers:");
        for (int i = 0 ; i <=100 ; i++) { // i++ means its increasing by 1 by 1    // 0,1,2,3,4,5,6,7,8,9,10,.......100,101

            if(i%2==0){ // checking if number can be divided by 2
                System.out.print(" "+i);  // 0,2,4,6,8
            }

            totaliter++; // increase the count of iteration by 1;
        }
        System.out.println("\n"+"total count of iteration: "+totaliter);  // total count of iterations

        // This is a second way to do it
        System.out.println("This is a second way to do the problem");
        int cevdet = 0;
        for(int sarp=0; sarp<=100; sarp+=2){

            System.out.print(" " +sarp);
            cevdet++; // this is where we increase the count number.
        }
        System.out.println("\n"+"the total iteration for the second way : "+cevdet);


    }




}
