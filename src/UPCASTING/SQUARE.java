package UPCASTING;

public class SQUARE extends SHAPE{

    double side;

    @Override
    double area() {
        return side * side;
    }
}
