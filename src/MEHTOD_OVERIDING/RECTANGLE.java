package MEHTOD_OVERIDING;



public class RECTANGLE extends SHAPE{

    double length;
    double width;

    @Override
    public double area() {
        return length * width ;
    }
}
