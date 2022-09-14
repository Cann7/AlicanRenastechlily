package Day_20_MethodswithReturnParams;

public class Topic2_ReturnType1 {

    // public               static           void               main        (String [] args){
    // Access-modifer       specifier        return-type        methodName  (paramater)           // return type can be anything ; string , integer , float, array...

    public static String Name(int a, int b){      // string is my return type

        if (a>b){

            return "Ziya";
        }
        else if (b>a) {
            return "Jason";
        }else {
            return "Huseyin";
        }
    }

    public static void main(String[] args) {
        String name=Name(4,4);
        System.out.println("The name is : " +name);
    }

}
