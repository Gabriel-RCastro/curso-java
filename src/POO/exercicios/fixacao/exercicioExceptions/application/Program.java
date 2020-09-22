package POO.exercicios.fixacao.exercicioExceptions.application;

import POO.exercicios.fixacao.exercicioExceptions.model.entities.Account;
import POO.exercicios.fixacao.exercicioExceptions.model.exceptions.WithdrawException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a account data");
            System.out.print("Number: ");
            int numberAccount = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holderAccount = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(numberAccount, holderAccount, initialBalance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            acc.withdraw(sc.nextDouble());
            System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
        } catch (WithdrawException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        } catch (RuntimeException e) {
            System.out.println("Unexpected error!");
        }

        sc.close();
    }
}
