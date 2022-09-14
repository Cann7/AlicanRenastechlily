package Day_36_FileStringBuilderIterator;

public class Topic1_StringBuilder {

    public static void main(String[] args) {
        /*

objects of String are immutable which means a constant and cannot be changed once created.
StringBuffer and StringBuilder allow us to make the changes.
StringBuilder: not synchronized
StringBuffer: synchronized

Methods:

append(String s) -- Appends the string to the builder,
charAt(int index) -- returns to the char in the index
delete(int start, int end) -- deletes the chars from the range
deleteCharAt(int index) -- removes the char at the given index
reverse() -- reverse the the char sequence
setCharAt(int index, char ch) -- > set the char at the specific index to given char
toString() --> returns to string representations in the StringBuilder

         */

        // append(String s)  -- Appends the string to the builder,
        StringBuilder SB =new StringBuilder(); // it is stringbuilder object
        SB.append("This is the String");   //SB = SB + ...                         // append : eklemek
        SB.append(" This is the second String");
        SB.append(90);
        System.out.println(SB);
//        String st =  "This is the String"; // String type variable
//        st = st+ "This is the second String";  // just existing the value  // keep the value and add it and resigned

        //toString() --> returns to string representations in the StringBuilder
        String St = SB.toString();
        System.out.println("This is from the String Variable : "+St);

        // charAt(int index ) -- returns to the char in the index
        char ch = SB.charAt(6);
        System.out.println("This is the char at index 6 : "+ch);

        //delete(int start, int end) -- deletes the chars from the range

        SB.delete(0,4);
        System.out.println("The SB object after delete : "+SB);

        //deleteCharAt(int index)  -- removes the char at the given index

        SB.deleteCharAt(3);
        System.out.println("After Delete : "+SB);

        //setCharAt(int index, char ch) -- > set the char at the specific index to given char

        SB.setCharAt(7,'C');
        System.out.println("After Set :"+SB);

        StringBuilder SB1 = new StringBuilder("This is String Builder");
        System.out.println("The SB1 Value : "+SB1);

        // reverse() -- reverse the char sequence
        SB1.reverse();
        System.out.println("Revrese of SB1 : "+SB1);

        StringBuffer SBuffer = new StringBuffer("This is String Buffer");
        System.out.println("The String Buffer : "+SBuffer);


    }
}
