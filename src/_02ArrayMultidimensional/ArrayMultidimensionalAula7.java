package _02ArrayMultidimensional;

public class ArrayMultidimensionalAula7 {
    public static void main(String[] args) {

        int[][] arr_1 = new int[3][];

        arr_1[0] = new int[2];
        arr_1[0][0] = 1;
        arr_1[0][1] = 2;

        arr_1[1] = new int[]{3,4,5,6};

        int[] array = {7,8,9,10,11,12};
        arr_1[2] = array;

        for (int[] arrBase: arr_1){
            for (int num: arrBase){
                System.out.print(num + " ");
            }
            System.out.println("\n<------------>");
        }

        System.out.println(" ");

        int[][] arr_2 = {{1,2}, {1,2,3}, {1,2,3,4,5,6}};

        for (int[] arrBase: arr_2){
            for (int num: arrBase){
                System.out.print(num + " ");
            }
            System.out.println("\n<------------>");
        }
    }
}
