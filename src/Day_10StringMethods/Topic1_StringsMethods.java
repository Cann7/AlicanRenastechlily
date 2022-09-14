package Day_10StringMethods;

public class Topic1_StringsMethods {
    public static void main(String[] args) {

       /* substring()             Extracts the characters from a string,
        beginning at a specified start position,
        and through the specified number of character                              String

        */

        String str1="LokmanEkin";
        String substr1=str1.substring(6);
        System.out.println(substr1);
        String substr2=str1.substring(0);
        System.out.println(substr2);
        String substr3= str1.substring(3,6);
        System.out.println(substr3);
        String substr4=str1.substring(3,str1.length());
        System.out.println(substr4);

        //toLowerCase()           Converts a string to lower case letters                                    String
        String str2="YaSeEN";

        String lowstr1=str2.toLowerCase();
        System.out.println(lowstr1);

        //toUpperCase()           Converts a string to upper case letters                                    String
        String upstr1= str2.toUpperCase();
        System.out.println(upstr1);


        //trim()                  Removes whitespace from both ends of a string                              String

        String str3=" Cev det ";
        String trstr3=str3.trim();
        System.out.println(trstr3);








    }
}
