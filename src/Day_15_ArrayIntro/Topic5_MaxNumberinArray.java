package Day_15_ArrayIntro;

public class Topic5_MaxNumberinArray {
    public static void main(String[] args) {

        // find  the max number in array if integers

        int[] miracle= {5,98,3,56,23,7}; // {-1,-5,-6,-2}
        int max = miracle[0]; // Assigning the first value in array to the max value,  // miracle[0] is just random number we can write 1or 3 doesnt matter

        for (int i = 0; i < miracle.length; i++) {

            if (max<miracle[i]){  // Check if the index i value in array is greater than the current value of max;
                max=miracle[i]; // max value is 98
            }

        }
        System.out.println("The max value in array is : "+max);










    }
}
