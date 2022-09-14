package Day_6_IfELseConti;

public class Topic1_IfElseExample {
    public static void main(String[] args) {

        // water temp is 100 it is boiling
        // water temp is 0 it is freezing
        // water temp is 0<tempo>10 so cold
        // water temp between 10-30 will cold
        // water temp 60-90 hot
        // water temp 90<temp<100 so hot
        // rest room temp

        String waterCond;
        int temp = 25;

        if (temp == 100){ //water temp is 100 it is boiling

            waterCond = "boiling";
           // System.out.println("the water condition is : " +waterCond);
        }
        else if(temp == 0){  //water temp is 0 it is freezing
            waterCond = "freezing";
            //System.out.println("the water condition is : " +waterCond);
        }
        else if(temp>0 && temp<10){//water temp is 0<tempo>10 so cold
            waterCond = "so cold";
           // System.out.println("the water condition is : " +waterCond);
        }
        else if(temp>=10 && temp<30){//water temp between 10-30 will cold
            waterCond = "cold";
            //System.out.println("the water condition is : " +waterCond);
        }
        else if(temp>=60 && temp<90){//water temp 60-90 hot
            waterCond = "hot";
           // System.out.println("the water condition is : " +waterCond);
        }
        else if(temp>=90 && temp<100) {//// water temp 90<temp<100 so hot
            waterCond = "so hot";
            //System.out.println("the water condition is : " + waterCond);
        }
        else {// rest room temp
            waterCond = "room temp";
            //System.out.println("the water condition is : " + waterCond);

        }

        System.out.println("this outside of condition is : " +waterCond);

    }
}
