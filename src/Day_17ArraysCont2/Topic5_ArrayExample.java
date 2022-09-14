package Day_17ArraysCont2;

import java.util.Arrays;

public class Topic5_ArrayExample {
    public static void main(String[] args) {
        // write a code where it will get all the word in a string and put into an array then lets reverse the words

        String ex  ="Tracy is cool";
        String [] exArr = ex.split(" "); // 3 {tracy , is , cool}
                         // index of the values       0   ,   1 ,   2

        System.out.println("The array : " + Arrays.toString(exArr));

        // {cool,is,Tracy}
        String [] reverse = new String[exArr.length];  // reverse = {null,null,null}

        int k =0;
        for (int i = exArr.length-1; i >=0 ; i--) {

            reverse[k] =exArr[i];
            k++;

        }

        System.out.println("the reverse of array is : " +Arrays.toString(reverse));

        System.out.println("the original array is : "+Arrays.toString(exArr));


        String reverst="";

        for (int i = 0; i < reverse.length; i++) {

            reverst=reverst+reverse[i]+" ";
        }
        System.out.println("the reverse string is : "+reverst);

        reverst=reverst.trim();

        System.out.println("the reverse string is : "+reverst);



    }
}
