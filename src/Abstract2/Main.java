package Abstract2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle("A tale of two cities");
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();
    }
}
