package Day_14_NestedLops;

public class Topic6_BreakAndContforOuter {
    public static void main(String[] args) {

        hawre:
        for (int i = 0; i < 3; i++) {

            System.out.println("Outer Loop I value : " +i);

            for (int j = 0; j < 3; j++) {

                if (j==2){
                    break hawre; // Break the outer loop using label "hawre"
                }
                System.out.println("               From the Inner Loop j value : " +j);

            }
        }

        System.out.println("=================================");

        ozan:
        for (int i = 0; i < 3; i++) {

            System.out.println("Outer Loop I value : " +i);

            for (int j = 0; j < 3; j++) {

                if (j==2){
                    continue ozan; // cont from outer loop using Label "ozan"
                }
                System.out.println("               From the Inner Loop j value : " +j);

            }
        }

    }
}
