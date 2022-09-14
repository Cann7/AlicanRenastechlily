package Day_17ArraysCont2;

import java.util.Arrays;

public class Topic1_ArrayEquals {
    public static void main(String[] args) {
        // Arrays are objects, they contain multiple values for us
        // In order for 2 arrays to be equal they should have the same values in the same order.

        int [] arr1={1,2,3,4};
        int [] arr2={1,2,3,4};

        // System.out.println("The Arr1" +arr1);
        // System.out.println("The Arr2" +arr2);

        System.out.println("**************************");

        boolean eq = Arrays.equals(arr1,arr2);
        System.out.println("Are those 2 arrays equal : " +eq);

        System.out.println("**************************");

        float [] arr3 = {2.1f,3.5f,5.0f};
        float [] arr4 = {2.0f,3.5f,5.0f};
        System.out.println("Are they equal : " +Arrays.equals(arr3,arr4));

        ////// You can assign Arrays to each other

        int [] arr5= {4,5,6,3};

        int [] arr6 = arr5;

        System.out.println("Arr6 : " +Arrays.toString(arr6));
        System.out.println("Arr5   :" +Arrays.toString(arr5));







    }
}
