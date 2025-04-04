package ARRAY;

import java.util.Arrays;

public class SecondMini {
    public static void main(String[] args) {

        int [] arr = {10,30,43,54,23,543,43,32};

        ///  finding second minimum

        int len = arr.length;

        System.out.println("elements of array");
        for (int element : arr ){
            System.out.println(element);
        }

        Arrays.sort(arr); /// function to sort the element of array

        System.out.println("sorted elements of array");
        for(int element : arr ){
            System.out.println(element);
        }
        System.out.println();
        System.out.println("second minimum element of array is :" + arr[1]);


    }
}
