package ABSTRACT;

public class MAIN {
    public static void main(String[] args) {

        HONDA honda = new HONDA();
        honda.brake();
        System.out.println();
        honda.run();
        System.out.println();
        honda.show();
        System.out.println();


        CAR c1 = new HONDA();
        c1.brake();
        System.out.println();
        c1.show();

    }
}
