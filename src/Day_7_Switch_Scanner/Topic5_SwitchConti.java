package Day_7_Switch_Scanner;

public class Topic5_SwitchConti {
    public static void main(String[] args) {

        String two ="we";

        switch (two){

            case "mo" :
                System.out.println("monday");
                break;   //IF DONT PUT BREAK THE CODE DONT KNOW WHERE TO STOP
            // FOR EXAMPLE IF DONT PUT BREAK HERE THE CODE WILL WRITE EVERYTHING BETWEEN THOSE THINGS
            // System.out.println("this is wednesday")
            // System.out.println("beautiful day")

            case "tu":
                System.out.println("tuesday");
                break;

            case"we":
                System.out.println("wednesday");
                break;

            case"thu":
                System.out.println("thursday");
                break;

            case"fri":
                System.out.println("friday");
                break;

            case"satu":
                System.out.println("saturday");
                break;

            case"sun":
                System.out.println("sunday");
                break;

            default:
                System.out.println("invalid");




        }



    }
}
