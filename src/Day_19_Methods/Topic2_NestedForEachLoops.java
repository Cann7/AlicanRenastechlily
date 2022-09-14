package Day_19_Methods;

public class Topic2_NestedForEachLoops {
    public static void main(String[] args) {

        int[][] name2d = {{1, 2, 4, 67, 90}, {98, 34, 23, 31}, {1, 3}, {78}};
        int size = name2d[0].length;
        System.out.println("the first array size is : " + size);
        int size1 = name2d[1].length;
        System.out.println("the second array size is : " + size1);
        int size3 = name2d[2].length;
        System.out.println("the third array size is : " + size3);
        int size4 = name2d[3].length;
        System.out.println("the fourth array size is : " + size4);

        int[] array1 = {2, 3, 4, 5, 6, 7, 8};

        for (int[] arr2d : name2d) {

            for (int a:arr2d) {

                System.out.println("the elements : " + a);
            }
        }


        }


    }

