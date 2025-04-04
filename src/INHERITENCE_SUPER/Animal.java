package INHERITENCE_SUPER;

public class Animal {

    double lifespan = 30.0;


    ///  constructor
    public Animal() {
        System.out.println("super class constructor");
    }
    ///  method

    public void animallife(){
        System.out.println("animal are loyal till their " + lifespan);
    }

    ///  1 more method

    public void show(){
        System.out.println("i am dog lover");
    }
}
