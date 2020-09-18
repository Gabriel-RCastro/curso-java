package POO.exemplos.testeHeranca.application;

import POO.exemplos.testeHeranca.entities.Account;
import POO.exemplos.testeHeranca.entities.BusinessAccount;
import POO.exemplos.testeHeranca.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        /*Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loanLimit(100.00);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loanLimit(200.00);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        // SOBREPOSIÇÃO DE METODOS

        Account acc6 = new Account(1005, "Joao", 1000.00);
        acc6.withdraw(200.00);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1006, "Pedro", 1000.00, 0.01);
        acc7.withdraw(200.00);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1007, "Joana", 1000.00, 500.00);
        acc8.withdraw(200.00);
        System.out.println(acc8.getBalance());*/

        // CLASSE 'Account' DEFINIDA COMO ABSTRATA

        Locale.setDefault(Locale.US);
        List<Account> listAccounts = new ArrayList<>();

        listAccounts.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        listAccounts.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        listAccounts.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
        listAccounts.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));

        double sum = 0.0;
        for (Account acc : listAccounts) {
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f\n", sum);

        for (Account acc : listAccounts) {
            acc.deposit(10.0);
        }

        for (Account acc : listAccounts) {
            System.out.printf("Update balance for account %d: %.2f\n", acc.getNumber(), acc.getBalance());
        }
    }
}
