package MarkerInterface;

public class User implements  Demo{

    ///  creating private instance

    private  int id;
    private String name;

    ///  creating constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /// creating getter & setters
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}



