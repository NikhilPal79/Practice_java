package Exception;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Bank {

    int balance;

    Scanner scanner = new Scanner(System.in);

    public void showBalance(){
        System.out.println("enter your balance");
        int balance = scanner.nextInt();
    }

    public void showDeposit(){
        System.out.println("enter your deposit ");
        int deposit = scanner.nextInt();
    }

    public void showWithdraw() throws InvalidAmount{
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your withdrawn amount ");
        int withdraw = scanner.nextInt();

        if (withdraw > balance ){
            throw  new InvalidAmount("you don not have enough balance ");
        }else{
            System.out.println(" you are allowed to continue your transaction");
        }
        System.out.println("done");

    }
}
