package Day_17ArraysCont2;

import java.util.Arrays;

public class Topic6_ReverseArrayinPlace {
    public static void main(String[] args) {

        // IF YOU NEED A ORIGINAL ONE DONT DO IT THIS BCZ YOU LL MISS THE ORIGINAL BEFORE THIS IS BETTER

        int [] arr= {3,4,5,6,7,8,9,0,-12};

        // our goal is to get arr = {-12,0,9,8,7,6,5,4,3}  9/2= 4.5 ==>4

        for (int i = 0; i < arr.length/2; i++) {

            int temp = arr[i];  //{3,4,5,6,7,8,9,0,-12}
            arr[i] = arr[arr.length-i-1]; // {-12,4,5,6,7,8,9,0,-12} // {-12,4,5,6,7,8,9,0,3} temp = 4
            arr[arr.length-i-1] = temp; // {-12,4,5,6,7,8,9,0,3}    // {-12,0,5,6,7,8,9,4,3}  // {-12,0,9,6,7,8,5,4,3} // {-12,0,9,8,7,6,5,4,3}
        }

        System.out.println("the reverse arr : " + Arrays.toString(arr));


        // Arrays.sort(N);  if we do this short method we are gonna get the numbers from less to great






    }

}
