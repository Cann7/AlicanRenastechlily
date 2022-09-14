package Day_15_ArrayIntro;

import sun.plugin2.os.windows.FLASHWINFO;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Topic2_Array {
    public static void main(String[] args) {

        int [] values={3,5,6,7};

        // in order for use to get the values in the array we use the index,

        // values [2]; this will return to the 3rd number of value

        System.out.println("the 3 rd value is : " +values[2]); // this will print the 3rd value;

        // values[1] will return the second value which is index 1;

        System.out.println("The 2nd value in array is: " +values[1]);

        // When you try to get value in the index that does not exist it will throw error

        //System.out.println("The 7th value in array is : " +values[7]); // This will throw an error.
        System.out.println("===========================");

        String [] St = {"ziya","sam","bahar","emrah","elif"};

        System.out.println("Emrah is : " +St[3]);
        System.out.println("Bahar : " +St[2]);

        System.out.println("============================");
        float Ziya=89;   // 89.00000
        float [] Fl={8934,87,Ziya};

        System.out.println("the 3rd value : "+ Fl[2]);
        System.out.println("========================");
        // What if i want to print all the values in the array

        int [] numbers={1,2,3,4,5,6,7,8,9,10};

        System.out.println(numbers); // This will print the hashcode or hash value



        // number.length is the size of array. it will return the number of element or values inside of array
        System.out.println("The size of array is : " +numbers.length);

        // the last index of an array is array ,length-1// the last index 9
        System.out.println("The last index is : " +(numbers.length-1));
        // number [0] ==> this will bring 1, which the first value
        // number [1] ==> this will bring 2, which the second value
        // number [2] ==> this will bring 3, which the third value
        // :
        // :

        // number [numbers.length-1] ==> this will bring the last value of the array ;
        System.out.println("==========================");

        for (int i = 0; i <numbers.length; i++) {
            System.out.print(" " +numbers[i]);

        }




    }
}
