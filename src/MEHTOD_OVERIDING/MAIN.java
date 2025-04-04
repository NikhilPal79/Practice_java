package MEHTOD_OVERIDING;



public class MAIN {
    public static void main(String[] args) {

        SQUARE square = new SQUARE();
        /*square.side = 5.0;*/
        System.out.println(square.area());
        System.out.println();

        CIRCLE circle = new CIRCLE();
        circle.radius = 5.0;
        System.out.println(circle.area());
        System.out.println();

        RECTANGLE rectangle = new RECTANGLE();
        rectangle.width = 2.0;
        rectangle.length = 3.0;
        System.out.println(rectangle.area());


    }
}
