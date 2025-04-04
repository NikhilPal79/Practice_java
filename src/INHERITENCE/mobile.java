package INHERITENCE;

public class mobile {


    ///  properties
   String brand;
   String colour;
   double capacity;

    ///  adding default constructor

    public mobile() {
    }


    /// creating concrete constructor
    public mobile(String brand, String colour, double capacity) {
        this.brand = brand;
        this.colour = colour;
        this.capacity = capacity;
    }

    ///  adding method

    public void showspec(){
        System.out.println(brand);
        System.out.println(colour);
        System.out.println(capacity);

    }

}
