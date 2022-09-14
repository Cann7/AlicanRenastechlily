package Day_30_Exceptions;

public class Topic3_UncheckedException {

    public static void main(String[] args) {

        int a =90;
        int b = 0;
        try {
            int result = a/b;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());  // getMessage() will get the message in String format
            System.out.println(e.toString());   // to.String gives us message whats the problem in here // the class and the message
            e.printStackTrace(); // it tells you class message and which line you messed up :) // this method print the Class name and the line of code where it threw the exception

        }


    }
}
