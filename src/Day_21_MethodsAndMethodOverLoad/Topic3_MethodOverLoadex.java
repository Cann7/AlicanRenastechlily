package Day_21_MethodsAndMethodOverLoad;

public class Topic3_MethodOverLoadex {

    // write a code where it sums numbers entered by user.
    public static int SUM(int a, int b){
        int result = a+b;
        //System.out.println("The result is  : "+result);  if we do move as a comment it give us solution and the rsult from main
        return result;
    }

    public static void SUM(int one, int two, int three){      // if I HAVE VOID I DONT NEED TO PUT RETURN !!!
        int solution = one + two + three;
        System.out.println("The solution : " +solution);


    }

    public static String SUM(int b,int c,int r,int t){

        int result =b+c+r+t;
        return "The result is "+result;
    }

    public static String SUM(int b,int c,int r,int t,String st){

        int cal =b+c+r+t;

        return cal + st;
    }



    public static void main(String[] args) {

        SUM(4,5,6);

        System.out.println("The result from main : "+SUM(3,4));

        int add10=SUM(1,2)+10;//3
        System.out.println("the result is after adding 10 ; "+add10);


        String re =SUM(90,45,67,89);
        System.out.println("the result after string return type : "+re);

        String ret = SUM(6,3,8,9,"ziya");



    }

}
