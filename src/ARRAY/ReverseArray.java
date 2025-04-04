package ARRAY;

public class ReverseArray {
    public static void main(String[] args) {

        int [] arr = {10,30,43,54,23,543,43,32};

        int n = arr.length;

        for (int i = 0; i < arr.length/2; i++) {
            /*
            int temp = x
            int x = int y
            int y = 20
            */
            int temp = arr[i];
            arr[i] = arr[n- i -1];
            arr[n- i -1] = temp;


        }
        System.out.println("reverse array");
        /*for every integer element in given array printout the element*/
        for (int element : arr){
            System.out.println(element + " ");
        }
    }
}
