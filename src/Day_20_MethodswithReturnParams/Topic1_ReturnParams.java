package Day_20_MethodswithReturnParams;

public class Topic1_ReturnParams {
    // Methods are code blocks where they only run when they are called.

    //decleration of the method
    // public               static           void               main        (String [] args){
    // Access-modifer       specifier        return-type        methodName  (paramater)
    //statments ,code
    //}
    // you have to have the return type, name, (), {}

    //Access-Modifer =public, protected ,default ,private
    //specifier   : static ,final ,abstract ,synchronized
    //return type : void , any datatype(int,string,char , int [] .......)
    //some method has paramertes some dont have parameter

    //create a method that will print java 10 times
    //
 /*
public == >: The public access modifier is specified using the keyword public.
They are accessible from everywhere in the program. There is no restriction on the scope of public data members.
*/

/*
protected ==> The protected access modifier is specified using the keyword protected.
The methods are accessible within the same package or subclasses in different packages.
*/

/*private == >
Private: The private access modifier is specified using the keyword private.
They are accessible only within the class in which they are declared.
Any other class of the same package will not be able to access these members.
*/

/* default ==> Default: When no access modifier is specified for a class, method, or data member – It is said to be having the default access modifier by default.
The methods which are not declared using any access modifiers, They have default access modifiers, which means only accessible within the same package.
*/

    public static void Count(int [] name){

        System.out.println("The count of items in the array is : "+name.length);

    }
    public static void Sum(int [] name1){

        int sum=0;
        for (int a:name1) {

            sum=sum+a;

        }
        System.out.println("The sum of all the items in the array is : "+sum);

    }
    public static void main(String[] args) {

        int [] arr={3,4,5,6,7,8,9};
        Count(arr);
        Sum(arr);














    }

}
