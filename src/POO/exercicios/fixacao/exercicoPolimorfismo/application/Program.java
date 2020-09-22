package POO.exercicios.fixacao.exercicoPolimorfismo.application;

import POO.exercicios.fixacao.exercicoPolimorfismo.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account acc;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char option = sc.next().charAt(0);

        if (option == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            acc = new Account(number, holder, initialDeposit);
        } else {
            acc = new Account(number, holder);
        }

        System.out.println("\nAccount data: \n" + acc);

        System.out.print("\nEnter a deposit value: ");
        acc.deposit(sc.nextDouble());
        System.out.println("Updated account data: \n" + acc);

        System.out.print("\nEnter a withdraw value: ");
        acc.withdraw(sc.nextDouble());
        System.out.println("Updated account data: \n" + acc);

        sc.close();
    }
}