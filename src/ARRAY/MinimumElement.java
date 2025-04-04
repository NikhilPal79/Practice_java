package ARRAY;

public class MinimumElement {
    public static void main(String[] args) {

        int [] arr = {10,30,43,54,23,543,43,32};

        int mini = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if( arr[i] < mini ){
                mini = arr[i];
            }
        }
        System.out.println("minimum element of array is :" + mini);
    }
}
