package Comparator;

import java.util.Comparator;

public class Employee {

    int id;
    String name;
    String city;
    String car;
    String model;

    public Employee(int id, String name, String city, String car, String model) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.car = car;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", car='" + car + '\'' +
                ", model='" + model + '\'' +
                '}';
    }


}
