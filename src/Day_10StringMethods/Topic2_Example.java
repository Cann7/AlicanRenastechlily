package Day_10StringMethods;

import java.util.Scanner;

public class Topic2_Example {
    public static void main(String[] args) {
        //user is asked to put a valid email(username)
        //enter a password where the password is at least 9 char.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a valid email adress:");
        String email = sc.next();

        System.out.println("Enter at least 9 char password:");
        String password = sc.next();

        //myemail@GMAIL.coM
        String formatedemail=email.toLowerCase();

        if (!(formatedemail.startsWith("@gmail.com")) &&formatedemail.contains("@gmail.com") && formatedemail.endsWith("@gmail.com")){
            System.out.println("Email is valid");
        }else{
            System.out.println("Your email is not a valid email");
        }

        if (password.length()>=9){
            System.out.println("valid password");

        }else {
            System.out.println("invalid password");
        }



    }
}
