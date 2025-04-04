package ARRAY;

import java.util.Arrays;

public class SumOfElements {
    public static void main(String[] args) {

        int [] arr = {10,30,43,54,23,543,43,32};

        ///  find sum of all elements

        int len = arr.length;

        Arrays.sort(arr);

        System.out.println("sorted element of array is ");

        for(int element : arr){
            System.out.println(element);
        }
        int sum = 0;

        for(int element : arr){
            sum += element;
        }
        System.out.println("sum of element of array is :"+ sum );




    }
}
