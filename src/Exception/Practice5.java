package Exception;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Practice5 {


        /// trying throw and throws

        public void showMethod(){
            makeMethod();
        }

        public void makeMethod() throws InvalidAge{
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your age");

            int age = scanner.nextInt();

            if (age < 18 ){
                throw new InvalidAge("you are not allowed ");
            }else{
                System.out.println("you are allowed ");
            }
            ;
        }



}