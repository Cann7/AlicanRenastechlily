package Day_16_ArrayCont;

public class Topic3_ArrayExample {
    public static void main(String[] args) {
        // if i want to swap the elements in array

        int[] swap = {30,90};

        int tmp=swap[0]; //30
        swap[0]=swap[1];
        swap[1]=tmp;

        // swap = { 90,30 }
        String [] sap={"ziya","serdar"};
        String tmp1=sap[0]; //30
        sap[0]=sap[1]; //{"serdar","serdar"}
        sap[1]=tmp1;  // {"serdar","ziya"}

        // sap = {"serdar","ziya"}

        System.out.println("The length of the first string in the array is : "+sap[0].length());









    }

}
