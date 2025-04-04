package ARRAY;

import java.util.Arrays;

public class AverageOfElements {
    public static void main(String[] args) {

        int [] arr = {10,30,43,54,23,543,43,32};

        ///  avg of elements of array

        double avg = Arrays.stream(arr).average().getAsDouble();

        System.out.println("average of array : " + avg);
    }
}
