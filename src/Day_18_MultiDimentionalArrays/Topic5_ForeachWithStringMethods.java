package Day_18_MultiDimentionalArrays;

public class Topic5_ForeachWithStringMethods {
    public static void main(String[] args) {

        // String is not a collection it is an object so we can not use Foreach Loop to iterate on every chars in String

        String StName = "SERAY";

        char [] Lt = StName.toCharArray();  // this will create a char array

        for (char ch:Lt) {  // We can iterate on the char array

            System.out.println("The Chars : "+ch);

        }

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        String cool = "Java is Cool but it is hard ";

        String [] wrd = cool.split(" "); // It will create a string array from the string by splitting with specified char

        for (String word : wrd){

            System.out.println("Words  are : "+word);
        }






    }



}
