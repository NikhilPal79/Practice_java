package ARRAY;

import java.util.Arrays;

public class AddArray {
    public static void main(String[] args) {
        ///  add two 1-D array

        ///  case if arr1 = arr2

        int [] arr1 = {15,46,95,54,78,222,1515,52};
        int [] arr2 = {494,94,161,130,3030,6161,44,94};

        int len = arr1.length;
        int len2 = arr2.length;

        int [] sumArray = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            sumArray[i] = arr1[i] + arr2[i];
        }

        System.out.println("sum of two equal 1-D array" + Arrays.toString(sumArray));



        ///  case 2

        ///  if both 1-D array are not equal

        int [] arr3 = {15,46,95,54,78,222,1515,52};
        int [] arr4 = {494,94,161,130,3030,6161,44,94};

        int maxLen = Math.max(arr3.length, arr4.length);
        int [] sumArray2 = new int[maxLen];

        for (int i = 0; i < maxLen; i++) {
            int val1 = (i < arr1.length) ? arr1[i] : 0;
            int val2 = (i < arr2.length) ? arr1[i] : 0;
            sumArray2[i] = val1 +  val2;

        }

        System.out.println("sum of two non-equal 1-D array :" + Arrays.toString(sumArray2));



    }
}
