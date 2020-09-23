package POO.exercicios.fixacao.statics.application;

import POO.exercicios.fixacao.statics.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CurrencyConverter.DOLLAR = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.BUY_DOLLARS = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converterInReais());

        sc.close();
    }
}
