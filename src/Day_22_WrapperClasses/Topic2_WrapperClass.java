package Day_22_WrapperClasses;

public class Topic2_WrapperClass {
    //Primitive Data Types
//byte
//short
//int
//long
//float
//double
//boolean
//char

///non primitives object and objets are getting created by classes

//Data Structure:
// 1. Array
// 2. Collection ==> only accepts objects
// 3. Map ==>  only accepts objects
//
// primitives: byte, short, int, long, float, double, char, boolean
//
//  wrapper classes:
//    Byte, Short, Integer, Long, Float, Double, Character, Boolean

//Java Wrapper Classes
//Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
//
//The table below shows the primitive type and the equivalent wrapper class:
//
//Primitive Data Type  Wrapper Class
//byte                 Byte
//short                    Short
//int                  Integer
//long                 Long
//float                    Float
//double               Double
//boolean              Boolean
//char                 Character
//Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList,
// where primitive types cannot be used (the list can only store objects):

//Example
//ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
//ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

    public static void main(String[] args) {

        int a =5; //this is primitive
        Integer numobj=new Integer(9); // this is wrapper class
        System.out.println("This is the value from the object of Integer : "+numobj);

        Double db=new Double(89.345); // the wrapper class for double

       // short sh=9;
        // Short srth=sh;

        Character ch=new Character('g');// char ch='g'

    }



}
