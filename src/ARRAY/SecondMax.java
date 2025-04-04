package ARRAY;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {

        int [] arr = {10,30,43,54,23,543,43,32};

        ///  finding the 2nd max

        int len = arr.length;
        System.out.println("array elements are :");
        for(int element : arr ){
            System.out.println( element + " ");
        }
        Arrays.sort(arr);

        System.out.println("sorted array is :");
        for (int element : arr){
            System.out.println(element + " ");
        }
        System.out.println("Second maximum element of array is : " + arr[1]);




    }
}
