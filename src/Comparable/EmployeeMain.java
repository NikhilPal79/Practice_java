package Comparable;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EmployeeMain {
    public static void main(String[] args) {

        /// Convert it into list

        List<Employee> employeeList = new ArrayList<>();


        employeeList.add(new Employee(5072,"nikhil","cambridge"));
        employeeList.add(new Employee(2122,"karan","kitchener"));
        employeeList.add(new Employee(5655,"ram","waterloo"));
        employeeList.add(new Employee(6846,"ajay","guelph"));
        employeeList.add(new Employee(7544,"harp","brantford"));

        System.out.println("before sorting(insertion order) : "+employeeList);
        System.out.println();
        System.out.println();

        /// add comparable interface to employee class

        ///  add compareTo method

        System.out.println("sorting on the basis of branch : "+employeeList);



    }
}
