package logicaDeProgramacao.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        double salario, imposto = 0;

        System.out.print("Informe o salario: "); salario = sc.nextDouble();

        if (salario <= 2000.00) {
            imposto = 0.00;
        }
        else if (salario <= 3000.00) {
            imposto = (salario-2000.00) * 0.08;
        }
        else if (salario <= 4500.00) {
            salario -= 3000.00;
            imposto += (salario * 0.18) + (1000.00 * 0.08);
        }
        else {
            salario -= 4500.00;
            imposto += (salario * 0.28) + (1000.00 * 0.08) + (1500.00 * 0.18);
        }

        if (imposto == 0.00) System.out.println("Isento");
        else System.out.printf("R$ %.2f", imposto);

        sc.close();
    }
}