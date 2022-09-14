package Day_16_ArrayCont;

public class Topic2_ArrayCont {
    public static void main(String[] args) {

        // find the average age of people in the array

        int [] ages= {24,60,23,19,45,90};

        // index       0, 1, 2, 3, 4, 5
        // sum of all the numbers // number of the ages
        int sum=0;
        for (int i = 0; i <ages.length ; i++) {
            sum+=ages[i];  // sum =sum+ ages[i]

                                               // the new sum =          0+24
                                               // the second i=1==>sum = 24+60
        }

        float ave=(float)sum/ages.length;  // this premitive casting

        System.out.println("the average age is : " +ave);

    }
}
