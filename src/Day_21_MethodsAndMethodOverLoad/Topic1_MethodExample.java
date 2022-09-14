package Day_21_MethodsAndMethodOverLoad;

public class Topic1_MethodExample {

    // Write A code where you make Omelet,

    // Step by step instruction
    // step 1) turn on the stove
    // step 2) Add butter based on how many people will be eating
    // step 3) wait for 5 minutes
    // step 4) get amount of eggs needed based on how people will eat
    // step 5) scramble your egg and add it to the pan
    // step 6) for medium  --- 4 min for well done wait 6 min

    public static void OnOff(String onoff){  // step 1) turn on the stove
        if (onoff.equalsIgnoreCase("On")){
            System.out.println("The Stove is ON");
        }else {
            System.out.println("The Stove is OFF");
        }

    }
    public static void AddButter(int people){ // step 2) Add butter based on how many people will be eating
        
        if (people == 2){
            System.out.println("2 mg butter is added to pan");
        } else if (people>2 && people<5) {
            System.out.println("4 mg butter is added to pan");
        }else {
            System.out.println("4 mg butter is added to pan");
        }
    }

    public static String Eggs(int eggs){  // step 4) get amount of eggs needed based on how people will eat
        return eggs+" of egges added";
    }
    public static void Scrum(){ // step 5) scramble your egg and add it to the pan
        System.out.println(" The eggs are mixed and added to the pan");
        System.out.println(Eggs(65));
    }

    public static void Wait(int mins){ // step 3) wait for 5 minutes and
        // step 6) for medium  --- 4 min for well done wait 6 min

        for (int i = 0; i < mins; i++) {
            System.out.println("One minute passed");
        }
        System.out.println(mins+ "is DONE");
    }

    public static void main(String[] args) {

        int ppl =4;
        String how="mid"; // "well"


      OnOff("ON");

      AddButter(ppl);
      Wait(4);
      System.out.println(Eggs(5));
      Scrum();
      if (how.equalsIgnoreCase("min")){
          Wait(4);

      }else {
          Wait(6);
      }

        System.out.println("The Omelette is DONE");

        System.out.println("*************************");

        Scrum();





    }
}
