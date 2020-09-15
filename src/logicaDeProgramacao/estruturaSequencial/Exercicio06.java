package logicaDeProgramacao.estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, pi = 3.14159;

        System.out.print("Informe o primeiro valor: "); A = sc.nextDouble();
        System.out.print("Informe o segundo valor: "); B = sc.nextDouble();
        System.out.print("Informe o terceiro valor: "); C = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f\n", (A*C)/2);
        System.out.printf("CIRCULO: %.3f\n", pi * (Math.pow(C, 2)));
        System.out.printf("TRAPEZIO: %.3f\n", ((A+B)*C)/2);
        System.out.printf("QUADRADO: %.3f\n", B*B);
        System.out.printf("RETANGULO: %.3f", A*B);

        sc.close();
    }
}