package Day_6_IfELseConti;

public class Topic5_TernaryExample2 {
    public static void main(String[] args) {

        // points > 100 or <0 - out of range
        //90 - 100 grade a
        //80-90 grade b
        //70-80 grade c
        //60-70 grade d
        //50-60 grade f
        // less than 50 grade failed

        int points = 90;
        String grade;

        grade = (points<0|| points>100) ? "out of range" : (points>=90 && points <=100) ? "grade a" :(points<90 && points>=80) ? "grade b"
                :(points<80 && points>=70) ? "grade c" : (points<70 &&points>=60) ? "grade d" : (points<60 && points>=50) ? "grade f" : "grade failed";

        System.out.println("student grade is  : " +grade);


    }
}
