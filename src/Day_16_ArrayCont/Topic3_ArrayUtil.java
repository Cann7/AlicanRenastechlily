package Day_16_ArrayCont;

import java.util.Arrays;

public class Topic3_ArrayUtil {
    public static void main(String[] args) {

        // Arrays has a utility as well

        int [] name ={3,4,5,2,1,-90,-230};

        for (int i = 0; i <name.length ; i++) {

            System.out.println(name[i]);
        }
        System.out.println("array: " +name);

        System.out.println("==================================");

        System.out.println(Arrays.toString(name));  // Arrays.toString(arrayName) will change the format

        String [] stArray={"Sarp","Elif","Gulay"};

        System.out.println("=====================================");
        System.out.println(stArray);

        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println(Arrays.toString(stArray));




    }
}
