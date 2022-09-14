package Day_24_ArrayListBulk;

public class Human {
    // Class variables

    int age;
    String Firstname;
    String Lastname;
    String job;
    String Gender;
    double height;
    double weight;

    public void SetEssentials(int insAge,String insFirstname,String insLastname){

        age = insAge;
        Firstname= insFirstname;
        Lastname= insLastname;

    }

    public void SetNonEssentials(String insJob,String insGender,double insHeight,double insWeight){
        job = insJob;
        Gender= insGender;
        height= insHeight;
        weight= insWeight;
    }

    public String GetName(){
        return Firstname + " " +Lastname;
    }
    public int GetAge(){
        return age;
    }
    public void PrintJobHanW(){
        System.out.println("The job is : " +job);
        System.out.println("The job is : " +height);
        System.out.println("The job is : " +weight);
    }


}
