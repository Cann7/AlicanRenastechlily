package Day_14_NestedLops;

public class Topic3_Example2 {
    public static void main(String[] args) {

        // Stairs in numbers

        for (int i = 6; i >=0; i--) {  // this loop will run 7 times // upside down stairs                   // for (int i = 6; i >=0; i--) { if we do this its gonna
                                                                                                             // be upside down means is ist gonna count by 6,5,4,3,2,1,0
            for (int j = 0; j <=i; j++) {  // first iteration will be 0,1,2,3,4,5,6
                                            // second iteration will be 0,1,2,3,4,5 and so on

                System.out.print(j +" "); // will run 21 times
            }
            System.out.println();
        }
        for (int i = 0; i <7; i++) {  // this loop will run 7 times a stair with numbers

            for (int j = 0; j <=i; j++) {  // first iteration j value will be 0 second iteration will be 0,1 third iteration will be 0,1,2, and so on

                System.out.print(j +" ");
            }
            System.out.println();
        }



    }
}
