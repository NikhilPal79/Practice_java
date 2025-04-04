package Singleton;

public class Singleton {

    private static Singleton user;

    public Singleton() {
    }


    private static Singleton getMethod(){
        if( user == null ){
            user = new Singleton();
        }return user;
    }

    public void showMethod(){
        System.out.println("showing singleton instance");
    }

    public static void main(String[] args) {

        Singleton s1 = new Singleton();
        s1.showMethod();
    }
}
