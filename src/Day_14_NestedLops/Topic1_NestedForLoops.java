package Day_14_NestedLops;

public class Topic1_NestedForLoops {
    /* Loop{
            dhsgfhsdfj
            Loop{  // Inner Loop
                   fgjhfgjkdfh
            }
    }


     */

    public static void main(String[] args) {

        int weeks= 3;  // for each week we have 7 days

        int days=7;

        for (int i = 1; i <=weeks; i++) {  // outer loop

            System.out.println("Week" +i);  // range time which is 3
            for (int j = 1; j <=days ; j++) {  // inner loop
                System.out.println("    Days: " +j);   //  iterations for outer loop * iterations for innner loop =  3*7=21
            }
        }




    }

}
