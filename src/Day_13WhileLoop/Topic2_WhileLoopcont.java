package Day_13WhileLoop;

public class Topic2_WhileLoopcont {
    public static void main(String[] args) {

        int i =0;
        while (i<10){

            //i++;  when we do before sout its gonna be count also 10 // this will increase the i value before running the code below

            System.out.println("the i value : "+i);
            i++;  // it is important to know when to increase the i value

        }
        System.out.println("----------------------------------");

        int j=0;
        while(j<=10){  // j=0
            if (j==8){
                j=j+2;  // if you do this you will get 0,2,4,6,10
                continue;
            }
            System.out.println("the even numbers " +j);
            j=j+2;   // in that case we will get 0,2,4,6

        }

        System.out.println("-----------------------");

        int k=0;
        while(k<=10){
            //System.out.println("the k value : "+k); // 0,1,2,3,4,5,6,7,8,9
            if (k==9){
                break;
            }
            System.out.println("the k value : "+k); // 0,1,2,3,4,5,6,7,8
            k++; // k = k+1
        }





    }
}
