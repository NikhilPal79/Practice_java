package ENCAPSULATION_getter_setter;

public class LOGINUSER {
    private String username;
    private int password;

    public LOGINUSER(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void validUser(String username, int password){
        if(this.username.equalsIgnoreCase(username) && this.password == password){
            System.out.println("valid username");
        }else{
            System.out.println("invalid username");
        }

    }
}
