package Day_20_MethodswithReturnParams;

import MyUtil.TestClassforPublic;





public class Topic5_UtilTest {

    public static void main(String[] args) {

        TestClassforPublic.FromDiffClass("Ziya","Yilmaz"); // i am able to get to that method it is
        // because defined as public

        double rtn =TestClassforPublic.Sum(90.34,76.46); // same for this one

        //TestClassforPublic.PMethod ==> i do not have access bcz it is defined as private, or protected or
        // default

        System.out.println(rtn);






    }
}
