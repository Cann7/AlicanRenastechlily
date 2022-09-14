package Day_27_ConstructorsandEncapsulation;

import java.util.Scanner;

public class StudentInfo {
    String name;
    double score;
    String grade;

    public StudentInfo(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        this.name=sc.next();
        System.out.println("Enter Student Score : ");
        this.score=sc.nextDouble();
        System.out.println("Enter Student Grade : ");
        this.grade=sc.next();

    }
}
