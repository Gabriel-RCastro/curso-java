package logicaDeProgramacao.estruturaCondicional;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.print("Informe o primeiro valor inteiro: "); A = sc.nextInt();
        System.out.print("Informe o segundo valor inteiro: "); B = sc.nextInt();

        if (A % B == 0 || B % A == 0) System.out.println("Sao Multiplos");
        else System.out.println("Nao sao Multiplos");

        sc.close();
    }
}
