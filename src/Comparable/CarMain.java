package Comparable;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car(4,"HONDA", "TOURING"));
        carList.add(new Car(7,"DODGE", "DURANGO"));
        carList.add(new Car(6,"HYUNDAI", "SENTA"));
        carList.add(new Car(5,"TOYOTA", "SPORTS"));
        carList.add(new Car(2,"DODGE", "CHALLENGER"));

        System.out.println("insertion order : "+carList);
        System.out.println();
        System.out.println();

        System.out.println("after sorting on model: "+carList);
    }
}
