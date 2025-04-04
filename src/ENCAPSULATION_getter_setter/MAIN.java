package ENCAPSULATION_getter_setter;

public class MAIN {
    public static void main(String[] args) {

        EMP emp = new EMP(120, "nikhil");
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println();
        emp.setId(222);
        emp.setName("ajay");

        System.out.println(emp.getId());
        System.out.println();

        System.out.println(emp.getName());
    }
}
