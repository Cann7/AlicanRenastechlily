package Day_15_ArrayIntro;

public class Topic4_ArrayExample {
    public static void main(String[] args) {

        int [] numbers= new int [4]; // I init it now   numbers = {0,0,0,0}

     /*   numbers[0]=3;  // assigning the values to the array
        numbers[1]=5;
        numbers[2]=90;
        numbers[3]=23;
        this is the manuel way to assign the values
     */

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=i+5;  // numbers[0] =5
                             // numbers[1] =6
                             // numbers[2] =7
                             // numbers[3] =8
        }

        System.out.println("the index 2 value is : " +numbers[2]);



    }
}
