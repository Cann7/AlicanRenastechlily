package Day_16_ArrayCont;

import java.util.Scanner;

public class Topic1_Homework7 {
    public static void main(String[] args) {

        /*Write code where:
        - User is asked to enter a string,
        - Use that string to see how many of 3 character substring is Palindrome
        - Print All the substring Palindrome Substrings
                - Example of Substring: word ==> "banana" 3 characters Palindrome substrings are ==> "ana", "nan" "ana". Count is 3.
        PS = This is a little hard question please give your best and make sure you only use the things we have learned so far.
        */

                     // b a n a n a   // ban  // ana // nan // ana
        // index        0,1,2,3,4,5

        // orange ==> ora // ran // ang // nge  the range is 0 - length - 3  // we put length -3 bcz question want to get 3
                                                                             // substring and after n we dont have 3 more character
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a string : ");
        String input =sc.next();
        int count =0;

        for (int i = 0; i <=input.length()-3 ; i++) {

            String sub=input.substring(i,i+3);  // starting is included but the ned point is not,
            System.out.println("The substring is : " +sub);
            String reverseSub ="";
            for (int j =sub.length()-1 ; j >=0 ; j--) {

                reverseSub=reverseSub+sub.charAt(j);

            }
            if (reverseSub.equals(sub)){
                count++;
                System.out.println("the p subs is : "+sub);
            }

        }
        System.out.println("the total count of p substring with 3 char : " +count);






    }
}
