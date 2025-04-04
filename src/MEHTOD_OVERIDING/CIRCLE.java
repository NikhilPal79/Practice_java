package MEHTOD_OVERIDING;

public class CIRCLE extends SHAPE{
    double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;

    }
}
