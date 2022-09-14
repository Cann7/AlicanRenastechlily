package Day_12_BreakStatement;

public class Topic2_BreakExamples {
    public static void main(String[] args) {
        // for(start, end , iter){
        // whatever is in here will run until the end point

        //}
             // break is used to break the code
            String hello = "Hello";
            String result = "";
        for (int i = 0; i < hello.length(); i++) {
            //  result = result + hello.charAt(i); the end rsult for this will be Hel

            if (hello.charAt(i)=='l'){
                break;
            }
            result = result + hello.charAt(i);  // the end result will be He

        }
        System.out.println(result);
        System.out.println("---------------------------");

        // I want to sum numbers from 0 to 50(included) but if my sum is over 140 I want to stop

        int sum = 0;

        for (int i = 0; i <=50 ; i++) { // i value 0,1,2,3,4,5......50

            sum = sum+i; // 0+1+2+3+4+5+6...+50        //System.out.println(sum); if we write this it will be sum+i like that 0+1  1+2  3+3  6+4  10+5 = 15  ....
            if(sum>=140){
                break;
            }

        }
        System.out.println("End Result = " +sum);



    }
}
