package Day_22_WrapperClasses;

public class Topic1_MethodOverLoading {

    public static String RemoveChar(String str,char c){

        String newstr="";
        for (int i = 0; i < str.length(); i++) {//"ABCDRTYTHIS"

            if (str.charAt(i) ==c){
                continue;
            }else {
                newstr=newstr+str.charAt(i);

            }
        }
        return newstr;
    }

    public static String RemoveChar(String str1,char ch,int start,int end){

        String str2="";
        for (int i = 0; i < str1.length(); i++) {

            if (i<start||i>=end) {
                str2 = str2 + str1.charAt(i);// "SRTERTE" "T" START :2 END : 4==

            }else {
                if (str1.charAt(i)==ch){
                    continue;
                }else {
                    str2=str2+str1.charAt(i);
                }
            }


        }
        return str2;
    }

    public static void main(String[] args) {
        String name="Ziya,Yaseen,Gulay";
        String [] names=name.split(","); //["Ziya","Yaseen","Gulay"]

        // Write a methods where it takes String and a char parameters and return to a string where the original
        // String does not contains the char that has been used as an input regardless of case

        // "abcdel",'c'

        System.out.println("this is the new string : "+RemoveChar("ABCDRTYTHIS",'T'));// FIRST WAY TO PRINT

        String st=RemoveChar("ABCDRTYTHIS",'T');// SECOND WAY TO PRINT
        st=st.toLowerCase();  // SECOND WAY TO PRINT
        System.out.println("this is a new string : "+st); // SECOND WAY TO PRINT

        // Use the existing method where you also pass the input parameters where indicates the starting index and
        // ending index
        // ex : "ERTESESR", 'E', 2,4 ==>"ERTSESR

        String whatever="DCFSSERTEDSAADFSDFAFSDFA";

        String newVal=RemoveChar(whatever,'S',4,12);

        System.out.println("The new string is  : "+newVal);





    }
}
