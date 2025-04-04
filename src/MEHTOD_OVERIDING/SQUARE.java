package MEHTOD_OVERIDING;



public class SQUARE extends SHAPE{
    double side;

    @Override
    public double area() {
        return side * side;
    }
}
