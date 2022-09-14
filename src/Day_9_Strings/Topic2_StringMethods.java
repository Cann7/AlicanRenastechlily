package Day_9_Strings;

public class Topic2_StringMethods {
    public static void main(String[] args) {

        String name= "renas";




  /*

Method             Description                                                                 Return Type
Part1
charAt()                Returns the character at the specified index (position)                     char
concat()                Appends a string to the end of another string                               String
contains()              Checks whether a string contains a sequence of characters                   boolean
equals()                compares two strings. returns true if the strings are equal,
                        and false if not                                                            boolean
equalsIgnoreCase()      Compares two strings, ignoring case considerations                          boolean


Part2
index0f()               Returns the position of the first found occurrence
                        of specified characters in a string                                         int

isEmpty()               Checks whether a string is empty or not                                     boolean

lastIndex0f()           Returns the position  of the last found occurrence of specified             int
                        characters in a string

length()                Returns  the length of a specified string                                   int
replace()               Searches a string for a specified value, and returns
                        a new string for a specified values are replaced                           string
replaceFirst()          Replace the first occurrence of a substring that matches the
                        given regular expression with the given replacement                        string
Part3
endsWith()              Checks whether a string ends with the specified character(s)               boolean
startsWith()            Checks whether a string starts with specified characters                   boolean
substring()             Extracts the characters from a string,
                        beginning at a specified start position,
                        and through the specified number of character                              String
toLowerCase()           Converts a string to lower case letters                                    String
toUpperCase()           Converts a string to upper case letters                                    String
trim()                  Removes whitespace from both ends of a string                              String



         */
        String str = "renas";
        char firstL = str.charAt(4);
        System.out.println(firstL);
        System.out.println(str.charAt(3));

        //concat()    Appends a string to the end of another string    string

        String str1="name0";
        String str2="name1";
        String str6="alican";


        String str3=str1.concat(str2);
        String str5= str1.concat(" "+str6).concat(" " + str2);
        System.out.println(str5);

        //String str3=str1+str2;
        //name0name1;

        String str4 = str1+str2;
        System.out.println(str4);

        //contains()              Checks whether a string contains a sequence of characters                   boolean

        String name1 = "alican";
        boolean YN = name1.contains("alican");
        System.out.println(YN);


        //endsWith()              Checks whether a string ends with the specified character(s)               boolean

        boolean YN1=name1.endsWith("an");
        System.out.println(YN1);

        //equals()                compares two strings. returns true if the strings are equal,
        //and false if not                                                                                  boolean

        String name2 = "Sam";
        String name3 = "sam";

        boolean YN3 = name2.equals(name3);
        System.out.println(YN3);
        String str9=new String("Ziya");
        String str8 = "Ziya";

        System.out.println(str9.equals(str8));
        System.out.println(str9==str8);

        //equalsIgnoreCase()      Compares two strings, ignoring case considerations                          boolean
        System.out.println(name2.equalsIgnoreCase(name3));

        //index0f()               Returns the position of the first found occurrence
        //                        of specified characters in a string                                         int

        String name5 = "banana";

        int ind = name5.indexOf('a');
        System.out.println(ind);

        //isEmpty()               Checks whether a string is empty or not                                     boolean

        String emp ="";
        System.out.println(emp.isEmpty());


       // lastIndex0f()           Returns the position  of the last found occurrence of specified             int
       // characters in a string

        //banana
        int lst = name5.lastIndexOf('a');
        System.out.println(lst);

        //length()                Returns  the length of a specified string                                   int
        String str100="steftefteteteettetette";
        int count=str100.length();
        System.out.println(count);


        //replace()               Searches a string for a specified value, and returns
        //                        a new string for a specified values are replaced                           string

        String name12="Gulay";
        String name13 =name12.replace("G", "T");
        System.out.println(name13);

        //replaceFirst()          Replace the first occurrence of a substring that matches the
        //                        given regular expression with the given replacement                        string

        System.out.println(name12.replaceFirst("Gu", "T"));

        //startsWith()            Checks whether a string starts with specified characters                   boolean
        String name16="Alican";
        boolean YN5 = name16.startsWith("A");
        System.out.println(YN5);








    }
}

