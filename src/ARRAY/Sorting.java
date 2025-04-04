package ARRAY;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int [] arr = {10,30,43,54,23,543,43,32};
        ///  sorting

        Arrays.sort(arr);
        System.out.println("sorted array");
        for(int element : arr){
            System.out.println(element);
        }
    }
}
