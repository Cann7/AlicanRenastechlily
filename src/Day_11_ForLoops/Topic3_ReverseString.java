package Day_11_ForLoops;

public class Topic3_ReverseString {
    // Strings are indexed
    // the first char in a string has index of 0
    // the last char in a string has index of length-1
    public static void main(String[] args) {

        String canrem = "Hello";
         //canrem.charAt(0);

        //System.out.println(canrem.charAt(0));
        System.out.println(canrem.charAt(canrem.length()-1)); // length -1 bring it o bcz the last charaCTER is this
        System.out.println(canrem.charAt(canrem.length()-2)); // when we write -2 it bringts l
        System.out.println(canrem.charAt(canrem.length()-3));
        System.out.println(canrem.charAt(canrem.length()-4));
        System.out.println(canrem.charAt(canrem.length()-5));

        String Reverse ="";

        for (int banu= canrem.length()-1; banu>=0;banu--){ // it will be start from the last index (4)

           Reverse = Reverse + canrem.charAt(banu);

        }
        System.out.println(Reverse);


    }


}
