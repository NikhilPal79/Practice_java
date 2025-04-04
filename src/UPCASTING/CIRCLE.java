package UPCASTING;

public class CIRCLE extends SHAPE{

    double radius;

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
