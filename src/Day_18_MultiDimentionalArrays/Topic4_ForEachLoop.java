package Day_18_MultiDimentionalArrays;

import java.util.Arrays;

public class Topic4_ForEachLoop {

    public static void main(String[] args) {

        // the for each loop is used when we don't know the starting and the end point, but we want to iterate over all the
        // elements in collections.

        int [] nums ={9,4,5,6,7};

        // for(Datatype variable : collection name){
     //}

        for (int var:nums) {

            System.out.println(var); // this will print every value starting from beginning until end
        }

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+"\n");

        String [] animals= {"horse","cat","dog"};

        for (String animal :animals){
            System.out.println("The Animal : "+animal);
        }

        for(String an:animals){

            if (an.equals("cat")){
                an="spider"; // This will only change the value of "an" variable not  the Array.

            }

        }
        System.out.println("the array is : "+ Arrays.toString(animals));

        System.out.println("***************************");

        int i =0;

        for (String an1:animals) {
            if (an1.equals("cat")){

                animals[i]="spider";

            }
            i++;
        }

        System.out.println("the array is : "+ Arrays.toString(animals));




    }
}
