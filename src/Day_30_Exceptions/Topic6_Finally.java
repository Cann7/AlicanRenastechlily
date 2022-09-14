package Day_30_Exceptions;

import java.util.NoSuchElementException;

public class Topic6_Finally {

    // finally keywords is used for if you want to run the code block no matter if the Exceptions occurs or not
    public static void main(String[] args) {
        int [] numbers={90,45,67};

        try{ // if you use try
            int a =numbers[2];
            System.out.println(a);
        }catch (ArithmeticException e){  // you have to use catch
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }
        finally {  // optional
            System.out.println("This is the final code");
        }
    }
}
