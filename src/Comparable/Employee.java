package Comparable;

public class Employee implements  Comparable<Employee>{

    int id;
    String name;
    String branch;

    public Employee(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.getBranch().compareTo(o.getBranch());
    }
}
