package logicaDeProgramacao.estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1, peca1, codigo2, peca2;
        double valor1, valor2, valorPagar;

        System.out.print("Codigo do 1º produto: "); codigo1 = sc.nextInt();
        System.out.print("Número de peças: "); peca1 = sc.nextInt();
        System.out.print("Valor: "); valor1 = sc.nextDouble();

        System.out.println();

        System.out.print("Codigo do 2º produto: "); codigo2 = sc.nextInt();
        System.out.print("Número de peças: "); peca2 = sc.nextInt();
        System.out.print("Valor: "); valor2 = sc.nextDouble();

        System.out.println();
        valorPagar = (valor1*peca1) + (valor2*peca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);

        sc.close();
    }
}
