package Comparator;

import java.util.Comparator;

public class CarComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCar().compareTo(o2.getCar());
    }
}
