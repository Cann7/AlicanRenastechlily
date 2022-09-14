package Day_18_MultiDimentionalArrays;

import java.util.Arrays;

public class Topic3_MultiArraysToString {
    public static void main(String[] args) {

        String [] StNames= {"sam","rachel","sarp"};

        System.out.println("The Array : " + Arrays.toString(StNames));

        String [][] twoNames={{"ziya","alan"},{"elif","rachel"}};

        System.out.println("The two dimention array : " +Arrays.toString(twoNames));
        System.out.println("The first array inside of the big array is : "+Arrays.toString(twoNames[0]));
        System.out.println("The first array inside of the big array is : "+Arrays.toString(twoNames[1]));

        // Using Arrays.deepToString will allow you to convert all the items for multidimensional arrays

        System.out.println("All the items in the twoNames arrays : " +Arrays.deepToString(twoNames));

        int [][][] three ={{{8,5,6,2},{3,90}},{{34,78,91},{1}}};

        System.out.println("The three dimension : "+Arrays.deepToString(three));


    }
}



