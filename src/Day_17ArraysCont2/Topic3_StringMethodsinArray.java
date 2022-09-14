package Day_17ArraysCont2;

import java.util.Arrays;

public class Topic3_StringMethodsinArray {
    public static void main(String[] args) {

        // string.split() this is a string method, you can  not use it for numbers or other data types
        String s="Ziya is instructor";

        String [] name=s.split("_");  // This method will get every substring starting from beginning until it
        //sees the char added in the qoutes  //  if we cant put the nothing it will be hecelyecek
        // you can not use "?" , "*" ,"+"

        System.out.println("The Array is : " + Arrays.toString(name));

        System.out.println("******************************");

        String ja="java is cool";
        String [] name2=ja.split(""); // it will get every chars in the substring but theated as string not Chars
        System.out.println("The Other array is : " + Arrays.toString(name2));
    }
}
