package Day_19_Methods;

public class Topic3_NestedForEach3 {
    public static void main(String[] args) {

        int [][][] array3={{{56},{79,98,9,23},{93,24,56}},{{89,90,23}},{{87,45,6},{0,1}},{{90,23,4},{1,2},{45,6}}};
        //int [][] arr2={{56},{79,98,9,23},{93,24,56}};
        int a1=array3[3][0][0];
        System.out.println("the value of a : "+a1);

        for (int [][] arr2:array3) {
            for (int[]arra1:arr2){
                for (int a:arra1){

                    System.out.println("The values : " +a);

                }
            }




        }




    }
}
