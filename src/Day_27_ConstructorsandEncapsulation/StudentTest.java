package Day_27_ConstructorsandEncapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentTest {

    // Print Student's name where student has grade of "A";

    public static void main(String[] args) {
        Student st1=new Student("Ziya","Yilmaz",80);
        Student st2=new Student("Shahnaz","Murad",90.45);
        Student st3=new Student("Sam","Francois",95);

        ArrayList<Student> listSt=new ArrayList<>();

        listSt.addAll(Arrays.asList(st1,st2,st3));

        for (int i = 0; i < listSt.size(); i++) {
            if (listSt.get(i).Grade == "A"){
                System.out.println("FirstName : " + listSt.get(i).Firstname + "        LastName : "+ listSt.get(i).Lastname);
            }
        }


        System.out.println("*************************************");

        ArrayList<StudentInfo> infoList =new ArrayList<>();
        for (int i = 0; i < 3; i++) {

            StudentInfo st =new StudentInfo();
            infoList.add(st);

        }

        System.out.println("The first student info : "+infoList.get(0).name);
        System.out.println("The second student info : "+infoList.get(1).name);

    }
}
