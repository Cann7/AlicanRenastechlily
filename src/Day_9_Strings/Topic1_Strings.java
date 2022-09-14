package Day_9_Strings;

public class Topic1_Strings {
    public static void main(String[] args) {

          /*
            in Java, string is an object that represents a sequence of characters.
            The java.lang.String class is used to create a string object.
            String name = "hsgdjahsdknaksdn";

            How to create a string object?
            There are two ways to create String object:

            1.By string literal
            String str= "Class"; // Pool
            String str2 = "Class";
            2.By new keyword
            String str1 = new String("Class1"); // heap memory
            String str4 = new String("Class1");
        */
        //create an string object
        // 1.By string literal
        //Java String literal is created by using double quotes.
        // For Example:
        //String str1="Hello";

        // Each time you create a string literal, the JVM checks the "string constant pool" first.
        // If the string already exists in the pool, a reference to the pooled instance is returned.
        // If the string doesn't exist in the pool, a new string instance is created and placed in the pool.

        // for example :
        // 1.By string literal
        String str1="Hello"; // java will check pool and since we don't have "Hello"
        //java will create a new string in the pool memory
        // :
        // :
        String str2="Hello";// this wont create a new string under pool memory
        //because we already created hello .
        //// If the string already exists in the pool, a reference to the pooled instance is returned.

        //reason of java is using string literal logic is to make java memory more efficient
        //Strings are immutable(unchangeable) you can not modify it.
        str2 = "Helo";
        String str6 = "Helo";
        String str7 = new String("Helo");

        System.out.println(str2);
        System.out.println(str2 == str6);
        System.out.println(str6 == str7);



    }
}
