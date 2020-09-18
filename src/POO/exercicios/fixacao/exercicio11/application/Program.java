package POO.exercicios.fixacao.exercicio11.application;

import POO.exemplos.testeHeranca.entities.Account;
import POO.exercicios.fixacao.exercicio11.entities.Company;
import POO.exercicios.fixacao.exercicio11.entities.Individual;
import POO.exercicios.fixacao.exercicio11.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> listTaxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i+1) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char response = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (response == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                listTaxPayers.add(new Individual(name, anualIncome, healthExpenditures));
            } else if (response == 'c') {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();

                listTaxPayers.add(new Company(name, anualIncome, numberEmployees));
            }
        }

        System.out.println("\nTAXES PAID:");
        for (TaxPayer tp : listTaxPayers) {
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.tax()));
        }

        double totalTaxes = 0.0;
        for (TaxPayer tp : listTaxPayers) {
            totalTaxes += tp.tax();
        }

        System.out.printf("\nTOTAL TAXES: $ %.2f\n", totalTaxes);

        sc.close();
    }
}
