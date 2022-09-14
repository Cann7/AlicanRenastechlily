package Day_14_NestedLops;

public class Topic4_WhileLoops {
    public static void main(String[] args) {

        int i=0;

        while (i<2){

            System.out.println("From the outer loop i value : " +i);

            int j=0;
            // this will increase the k value before the code block are executed

            while(j<2){
                System.out.println("        From Inner loop j value :  " +j);
                j++;
            }
            i++; // this will increase the k value after the code block are executed

        }
        System.out.println("===========================");

        int k= 0;
        while(k<3){

            System.out.println("From the while loop, outer loop the k value : " +k);

            for (int l = 0; l <3 ; l++) {

                System.out.println("                  From the innner For Loop l value : " +l);

            }
            k++;  // this will increase the k value after the code block are executed
        }
        System.out.println("===========================");

        for (int j = 0; j < 3; j++) {
            System.out.println("However :    from for loop");

            int f=0;
            while (f<2){
                System.out.println("                        whatever :  while loop     ");
                f++;
            }

        }


    }
}
