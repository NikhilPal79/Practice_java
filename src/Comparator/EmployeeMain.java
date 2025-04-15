package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(5072,"nikhil","cambridge","honda","touring"));
        employeeList.add(new Employee(2122,"karan","kitchener","hyundai","sonata"));
        employeeList.add(new Employee(5565,"ramneek","waterloo","dodge","dorango"));
        employeeList.add(new Employee(7544,"harp","fountain","toyota","sports"));
        employeeList.add(new Employee(6846,"ajay","ayr","mazda","sedan"));

        System.out.println("insertion order : "+employeeList);
        System.out.println();
        System.out.println();

        Collections.sort(employeeList, new CityComparator());
        System.out.println("sorted on basis of city : "+employeeList);
        System.out.println();
        System.out.println();

        Collections.sort(employeeList, new CarComparator());
        System.out.println("sorted on basis of car : "+employeeList);
        System.out.println();
        System.out.println();

        Collections.sort(employeeList, new IdComparator());
        System.out.println("sorted on basis of id : "+employeeList);


    }
}
