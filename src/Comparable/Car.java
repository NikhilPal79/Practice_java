package Comparable;

public class Car implements Comparable<Car>{

    int numberOfCapacity;
    String name;
    String model;

    public Car(int numberOfCapacity, String name, String model) {
        this.numberOfCapacity = numberOfCapacity;
        this.name = name;
        this.model = model;
    }

    public int getNumberOfCapacity() {
        return numberOfCapacity;
    }

    public void setNumberOfCapacity(int numberOfCapacity) {
        this.numberOfCapacity = numberOfCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfCapacity=" + numberOfCapacity +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
/// return this.productId- o.productId; for int
    @Override
    public int compareTo(Car o) {
        return this.numberOfCapacity-o.numberOfCapacity;
    }
}
