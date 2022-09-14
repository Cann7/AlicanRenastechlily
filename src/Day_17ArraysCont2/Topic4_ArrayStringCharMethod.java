package Day_17ArraysCont2;

import javafx.scene.shape.ClosePathBuilder;

import java.util.Arrays;

public class Topic4_ArrayStringCharMethod {
    public static void main(String[] args) {
        // String name ="ZiyaYilmaz"
        // name.toCharArray() ---> this will get all the chars into char [] (array)

        String name1= "KubraGulay";
        char [] Chararr= name1.toCharArray();  // this will get all the chars in the name1 string and put in Chararr array is as characters (char)
        System.out.println("The Char array is : " + Arrays.toString(Chararr));

        String name2 = "Bahar + Rachel";

        char[]CharArr2=name2.toCharArray();
        System.out.println("This is the second array : " +Arrays.toString(CharArr2));




    }
}
