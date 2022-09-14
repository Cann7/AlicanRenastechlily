package Day_19_Methods;

public class Topic5_MethodsExamples {


        //public             static          void             main           (String [] args){
        //access-modifier     specifier       return-type      methodName      (parameter)

        public static void MyFirstMethod(){

            System.out.println("This is my first method ");

        }

        public static void SumtheNumbers(int a,int b){

            int sum=a+b;
            System.out.println("the sum of those two numbers is : "+sum);

            MyFirstMethod(); // calling a method inside another method

        }

        public static void main(String[] args) {

            MyFirstMethod();
            System.out.println("This is inside of main method");
            //MyFirstMethod();

            SumtheNumbers(7,10);


        }
}
