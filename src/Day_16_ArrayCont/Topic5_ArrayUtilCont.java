package Day_16_ArrayCont;

import java.util.Arrays;

public class Topic5_ArrayUtilCont {
    public static void main(String[] args) {

        // Array,sort(array)
        // the sort will be in increasing order

        int [] srt={90,45,34,-90,-1000,400};

        Arrays.sort(srt);

        for (int i = 0; i < srt.length; i++) {

            System.out.println(srt[i]);
        }

        System.out.println("_________________________________");

        System.out.println(Arrays.toString(srt));

        System.out.println("++++++++++++++++++++++++++++++++++");

        int [] srt2={78,34,5,-230,67};

        //System.out.println(Arrays.sort(srt2).);  Arrays.sort(arrayname) will get the array and sort it assigns back to same array

        System.out.println("++++++++++++++++++++++++++++++++++++");

        String [] str3= {"cevdet","sam","ziya","bahar"};

        Arrays.sort(str3);

        System.out.println(Arrays.toString(str3));









    }
}
