package Day_18_MultiDimentionalArrays;

public class Topic6_ForeachExample {
    public static void main(String[] args) {

        int [] nums = {5,6,7,3,4,2,3,4,5,6,7,90,76,55,77,33,23,21,45,67,89};

        // write a code where you sum all the even numbers in the arrays as Evensum
        // using same array calculate the sum of all the odd number in the array as Oddsum

        int EvenSum=0;
        int OddSum=0;

        for (int number:nums) {

            if (number%2==0){

                System.out.println("The number is even : "+number);

                EvenSum=EvenSum+number;

            }else {

                System.out.println("The number is odd : "+number);

                OddSum=OddSum+number;
            }

        }

        System.out.println("The sum of all the even numbers in array : " +EvenSum);
        System.out.println("The sum of all the even numbers in array : " +OddSum);


    }
}
