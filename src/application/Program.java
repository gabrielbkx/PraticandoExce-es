package application;

import model.entities.Account;
import model.exeptions.AccountExeption;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            System.out.print("Enter amount for withdraw: ");
            double withdrawAmount = sc.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawLimit);

            acc.withdraw(withdrawAmount);
            System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
            sc.close();
        }catch (AccountExeption e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}
