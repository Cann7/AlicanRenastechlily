package Day_13WhileLoop;

public class Topic6_doWhileExample {
    public static void main(String[] args) {

        // sum all the even numbers between 0 to 100 (included)

        int i =0;
        int total=0;

        do {
            if (i ==78){
                i+=2;
                continue;
            }
            if (i==100){
                break;
            }
            total=total+i;
            i=i+2;

        }while(i<=100);

        System.out.println("the Sum of all the even numbers is: " +total);



    }
}
