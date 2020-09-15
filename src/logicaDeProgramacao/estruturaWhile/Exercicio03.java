package logicaDeProgramacao.estruturaWhile;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0, codigo = sc.nextInt();

        while (codigo != 4) {
            if (codigo == 1) {
                alcool += 1;
            } else if (codigo == 2) {
                gasolina += 1;
            } else if (codigo == 3) {
                diesel += 1;
            }
            codigo = sc.nextInt();
        }

        System.out.printf("MUITO OBRIGADO\n" +
                "Alcool: %d\n" +
                "Gasolina: %d\n" +
                "Diesel: %d",
                alcool, gasolina, diesel);

        sc.close();
    }
}