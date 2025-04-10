package If_Else;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = scanner.nextInt();

        if( n % 2 == 1){
            System.out.println("WEIRD");
        }else if(n >= 2 && n <= 5){
                System.out.println("WEIRD");
        }else if(n >= 6 && n <= 20){
            System.out.println("NOT WEIRD");
        }else if (n % 2 == 0 && n >= 20){
            System.out.println("NOT WEIRD");
        }else{
            System.out.println("nothing");
        }
    }

}



