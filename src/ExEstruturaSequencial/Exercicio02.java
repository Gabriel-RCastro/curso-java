package ExEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio, area, pi = 3.14159;

        System.out.print("Informe o valor do raio: "); raio = sc.nextDouble();
        area = pi * (raio*raio);
        System.out.printf("A = %.4f", area);
    }
}
