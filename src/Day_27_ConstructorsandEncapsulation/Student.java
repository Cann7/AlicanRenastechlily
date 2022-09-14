package Day_27_ConstructorsandEncapsulation;

public class Student {

    String Firstname;
    String Lastname;
    double Score;
    String Grade;

    public Student(String fn,String ln,double sc){

        this.Firstname=fn;
        this.Lastname=ln;
        this.Score=sc;
        if (sc>90){
            this.Grade="A";
        }else {
            this.Grade="B";
        }

    }


}
