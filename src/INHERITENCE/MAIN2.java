package INHERITENCE;

public class MAIN2 {
    public static void main(String[] args) {

        Car car = new Car();
        car.showCarSpec();
        System.out.println();

        Honda honda = new Honda();
        System.out.println(honda.model = "touring");
        System.out.println(honda.colour = "black");
        System.out.println(honda.name = "civic");
        honda.showCarSpec();
        System.out.println();

        Mazda mazda = new Mazda();
        System.out.println(mazda.model = "sports");
        System.out.println(mazda.colour = "blue");
        System.out.println(mazda.name = "roadstar");
        mazda.showCarSpec();
        System.out.println();

        Dodge dodge = new Dodge();
        System.out.println(dodge.model = "ram");
        System.out.println(dodge.colour = "red");
        System.out.println(dodge.name = "r250");
        dodge.showCarSpec();

    }
}
