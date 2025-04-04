package ENCAPSULATION_getter_setter;

public class EMP {
    private int id;
    private String name;

    ///  creating constructor
    public EMP(int id, String name) {
        this.id = id;
        this.name = name;
    }

    ///  creating getter and setter

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
}
