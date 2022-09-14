package Day_19_Methods;

import java.util.Scanner;

public class Topic6_MethodExample2 {
    // Write a method that has 3 input parameters and finds the max number between those 3 numbers
    public static void Myfunc(int a ,int b, int c){

        int max=0;
        if (a>b && a>c){
            max=a;
        } else if (b>a && b>c) {
            max =b;
        }else{
            max=c;
        }
        System.out.println("The max number is : " +max);

    }

    public static void CMFunc(){

        System.out.println("enter a name");
        Scanner scan=new Scanner(System.in);
        String name =scan.next();

        System.out.println("the name you enter is : "+name);



        //Myfunc(18,29, 0);

    }

    // print the name multiple times using for loop;
    public static void PrintName(String name){

        System.out.println("name is : "+name);

    }

    public static void Printname1(int times){

        for (int i=0;i<times;i++){

            System.out.println("The name is : ziya");

        }

    }




    public static void main (String[] args){

        CMFunc();
        //CMFunc();

        Myfunc(8 ,90,9 );

        for (int i=0;i<10;i++){
            PrintName("Sarp");
        }

        Printname1(4);


    }
}
