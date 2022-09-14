package Day_22_WrapperClasses;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Topic3_TypeCasting {
    //Type Casting
    //1.Autoboxing: Converting a primitive value into an object of the corresponding wrapper class is called autoboxing.
    // For example, converting int to Integer class. The Java compiler applies autoboxing when a primitive value is:
    //Passed as a parameter to a method that expects an object of the corresponding wrapper class.
    //Assigned to a variable of the corresponding wrapper class.
    //2.Unboxing: Converting an object of a wrapper type to its corresponding primitive value is called unboxing.
    // For example conversion of Integer to int. The Java compiler applies unboxing when an object of a wrapper class is:
    //Passed as a parameter to a method that expects a value of the corresponding primitive type.
    //Assigned to a variable of the corresponding primitive type.
    //The following table lists the primitive types and their corresponding wrapper classes,
    // which are used by the Java compiler for autoboxing and unboxing:
    //Primitive Data Type	Wrapper Class
    //byte	                Byte
    //short	                Short
    //int	                Integer
    //long	                Long
    //float	                Float
    //double	            Double
    //boolean	            Boolean
    //char	                Character

    public static void main(String[] args) {

        Integer in=new Integer(10); // we dont need to use this instead of this we can use  Integer in1=10   Autoboxing is easy

        Integer in1=10; // Autoboxing

        char ch='o';
        Character ch1=ch; // Autoboxing
        System.out.println(ch1);

        Double db1=905.76; // Autoboxing

        boolean bl=false;
        Boolean bl1=bl;
        Boolean bl2 =true; // Autoboxing

        // ArrayList<Integer> name = ArrayList<>() --> Valid
        // ArrayList<int> name = ArrayList<>(0 ----->  invalid

        Character newCh=new Character('c');
        char prCh=newCh;   // UNBOXING

        Integer in3= new Integer(90);

        int b=in3;  /// Unboxing


    }
}
