package ARRAY;

import java.util.Arrays;



public class AddTwo2_DArray {
    public static void main(String[] args) {

        int[][] arr1 = {{54, 12, 4}, {2, 36, 40}, {6, 4, 5}};
        int[][] arr2 = {{2, 9, 40}, {5, 3, 6}, {3, 5, 12}};

        ///  add two 2-D array


        int rows = arr1.length;
        int cols = arr1[0].length;

        int[][] sumArray = new int[rows][cols];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < cols; j++) {

                sumArray[i][j] = arr1[i][j] + arr2[i][j];

            }
        }
        System.out.println("sum of array : ");
        for (int[] element : sumArray) {
            System.out.println(Arrays.toString(element));
        }
    }
}
