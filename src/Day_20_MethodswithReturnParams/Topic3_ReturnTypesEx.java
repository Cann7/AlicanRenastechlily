package Day_20_MethodswithReturnParams;

public class Topic3_ReturnTypesEx {

    // write a method where it gets an Array of int as a input parameter and returns to the max number in Array

    public static void main(String[] args) {

         int [] arr1={-90,-30,-20,0};
         int maximum=MAX(arr1);
        System.out.println("The max value is : "+maximum);

        System.out.println("The other way of priting it : "+MAX(arr1));

        // add 5 to the maximum valiue;

        int addedversion =maximum+5;

        // subs 10 from the max value;

        int subs=maximum-10;            // if we put MAX its gaonna be 1000 appx. bcz of for loops instead of this we call just maximum

        System.out.println("added version is: " +addedversion);
        System.out.println("Subs version is : "+subs);

    }

    // the method starts here

   public static int MAX (int [] JustName){
        int max=JustName[0];
       for (int a: JustName) {

           if (max<a){
               max=a;
           }
       }
       return max;
   }



}
