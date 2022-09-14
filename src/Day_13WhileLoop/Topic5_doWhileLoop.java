package Day_13WhileLoop;

public class Topic5_doWhileLoop {
    public static void main(String[] args) {

        // The Concept do while loop is
        // do{
        // code block
        // }while(condition);

        int i=30;
        do {
            System.out.println("the i value : " +i);  // it still checking first this and gpoing to while (i<10) and looks that is false
            i++;
        }while(i<10);

        /* int j =0;
        while(j<10){
          j++
          }
         */

        System.out.println("========================");
        int j=9;
        do {
            if (j<10){
                System.out.println("the i value : " +j);
                j++;
            }

        }while(j<10);





    }
}
