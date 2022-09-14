package Day_30_Exceptions;

public class Topic4_CheckedExceptions {

    public static void main(String[] args) {

        System.out.println("Start");
        System.out.println("Wait one second");
        try {
            Thread.sleep(1000);
            for (int i =0; i<10; i++){
                Thread.sleep(100);
                System.out.println(i);
            }
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }



    }
}
