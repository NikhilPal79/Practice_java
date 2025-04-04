package ENCAPSULATION_getter_setter;

public class MAINLOGIN {
    public static void main(String[] args) {

        LOGINUSER loginuser = new LOGINUSER("nikhil", 420);
        loginuser.validUser("nikhil",420);
        System.out.println();
        loginuser.validUser("mayank",120);
        System.out.println();

        ///  hacker tries to change \

        loginuser.setPassword(123456);

        System.out.println(loginuser.getPassword());
        ///  password is changed

        loginuser.validUser("nikhil",123456);






    }
}
