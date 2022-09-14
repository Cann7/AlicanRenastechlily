package Day_17ArraysCont2;

import java.util.Arrays;

public class Topic2_ArrayExample {
    public static void main(String[] args) {

        //Adding 2 arrays into one
        int [] arr1={2,3,4,5}; //put arr1 into arr3 first
        int [] arr2={3,4,5,6,7}; // then put arr2 in thr arr3

        int size = arr1.length +arr2.length;  // size 9

        int [] arr3= new int[size];  //{0,0,0....0}  at the init stage

        for (int i = 0; i < arr1.length; i++) {

            arr3[i]=arr1[i];  // i = 0 arr3[0] = arr1[1] == 2 arr3 ={2,3,4,5,0,0,0,0}

        }
        // arr3 = {2,3,4,5,0,0,0,0,0}

        int k =0;
        for (int i = arr1.length; i <size ; i++) {  // i=4, k=0
            arr3[i] = arr2[k]; //// i = 4 : arr3[4] = arr2[0] ,,, arr3 ={2,3,4,5,3,0,0,0,0}
                                 // i = 5   k=1 ;  arr3[5] = arr2[1]
            k++;
        }

        System.out.println("The arr3 : " + Arrays.toString(arr3));

    }
}
