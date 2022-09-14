package Day_4_Operators;

public class LogicalOperations {

    public static void main(String[] args) {

      // AND ==> "&&" , if an operation contains
        // AND (&&) in order for the result to be true all of them should result to true

        boolean balls = (12>7)&&(3<8)&&(9>=7);
        System.out.println(balls);

        boolean flowers = (true)&&(3<=8)&&(8!=9)&&(false);         //! means not
        System.out.println(flowers);

        // OR operation "||" the that OR works, if any of the comperassion is true it return true;

        boolean flo = (9>11)||(6<9);      //  "||"  this means or if there is only one true result will be true definitely
        System.out.println(flo);

        boolean shoes = ("Alican"=="alican")||('C'=='c');
        System.out.println(shoes);

        //NOT "!"


        boolean cars = !("red"=="blue");
        System.out.println(cars);

        boolean Q = !(((4==5)||(7<9))&&((8<=10)||(true)));      // (false) || (true) = (true)      (true)||(true)=(true)     and true and true = true but there is !  so then it becomes FALSEEE
        System.out.println(Q);




    }



}
