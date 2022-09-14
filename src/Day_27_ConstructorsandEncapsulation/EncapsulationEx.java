package Day_27_ConstructorsandEncapsulation;

public class EncapsulationEx {

    private String SSN;
    private double Salary;
    public String Firstname;
    public String Lastname;

    public EncapsulationEx(String fn,String ln){
        this.Firstname=fn;
        this.Lastname=ln;

    }

    // Getter for SSN, Normally does take any params and returns the private variable value;
    public String getSSN(){
        return SSN;  // 786-234-8790 thats string bcz there is (-)  -->   7862348790
    }

   // They usually have void return type and that's the params with the same data type of the instance variable
    // that we are trying to set
    public void setSSN(String val){
        this.SSN =val;

    }

    public double getSalary(){
        return Salary;
    }

    public void setSalary(double salary) {

            this.Salary = salary;


    }
}
