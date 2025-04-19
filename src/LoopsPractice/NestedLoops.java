package LoopsPractice;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "," + j + " ");
            }
        }
        System.out.println();
        System.out.println();


        for (int i = 0; i < 6; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println();
        System.out.println();


        String[] cars = {"Volvo", "BMW", "Ford"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println();
        System.out.println();

        int[] myNumbers = {1, 2, 3, 4, 5};
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
