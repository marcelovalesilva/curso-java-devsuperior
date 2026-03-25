package src.application;

import java.util.Locale;
import java.util.Scanner;

import src.entities.Account;
import src.exceptions.BussinessException;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");   
        System.out.print("Number: ");
        int number = sc.nextInt();  
        System.out.print("Holder: ");
        sc.nextLine(); // Consume the remaining newline
        String holder = sc.nextLine();  
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);
        
        System.out.println();
        System.out.print("Inform the amount for withdraw: ");
        double withdrawAmount = sc.nextDouble(); 

        try {   
            account.withdraw(withdrawAmount);
            System.out.println("Novo saldo: " + String.format("%.2f", account.getBalance()));
        } catch (BussinessException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }





}
