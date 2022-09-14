package Day_30_Exceptions;

public class Topic2_ExceptionvsError {

    public static void Infinite(int num){

        while (num>0){
            num+=1;
            System.out.println(num);
            Infinite(num);
        }
    }

    public static void main(String[] args) {
        // Infinite(4); StackOverFlow Error

        // there is 2 ways to handle the Exceptions 1 ) try{}catch{} blocks 2) using throw/ throws

        /* try{
        code
        } catch(Exception name){

        code block
        }

         */

        int [] nums= {7,8,9,10};
        System.out.println(nums[3]);
       try {
           int a = nums[9];
           System.out.println(a);  // since the exception happened before this line it will not get executed
       }catch (ArrayIndexOutOfBoundsException e){     // in here (e) is just randomly letter you can use whatever you want

           System.out.println("Index 7 is not there");

       }
        System.out.println("This is the code");
    }
}
