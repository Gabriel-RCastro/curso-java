package logicaDeProgramacao.estruturaSequencial;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

        System.out.print("Informe o primeiro valor: "); valor1 = sc.nextInt();
        System.out.print("Informe o segundo valor: "); valor2 = sc.nextInt();

        System.out.print("A soma dos dois valores é: " + (valor1+valor2));

        sc.close();
    }
}
